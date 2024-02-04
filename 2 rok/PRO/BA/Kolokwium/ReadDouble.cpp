#include <algorithm>
#include <iostream>
#include <iomanip>
#include <sstream>
#include <vector>
#include <string>
using namespace std;

int main()
{
	ostringstream os;
	for(string str;getline(cin,str);) os<<str<<endl;
	string content=os.str();
	for(char &ch:content) if(ch==',') ch='.';
	for(char &ch:content) if(ch=='\t') ch=' ';
	istringstream is(content);
	unsigned R,C;
	is>>R>>C;
	vector<vector<double>> tb(R,vector<double>(C));
	for(vector<double> &row:tb)
	{
		for(double &cell:row)
		{
			is>>cell;
		}
	}
	for(vector<double> &row:tb)
	{
		for(double &cell:row)
		{
			cout<<setw(9)<<setprecision(2)<<cell;
		}
		cout<<endl;
	}
	return 0;
}
