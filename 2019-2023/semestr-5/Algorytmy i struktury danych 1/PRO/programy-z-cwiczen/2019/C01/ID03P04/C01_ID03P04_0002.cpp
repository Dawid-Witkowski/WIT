///213.135.46.21:7070
#include <iostream>
using std::cout;
using std::cin;
using std::string;
using std::endl;

int main(){
    int sT;
    int * pT;

    cout<<"sT ?= ";
    cin>>sT;
    pT = new int[sT];

    for(int i=0;i<sT;pT[i] =i++);
    for(int i=0;i<sT;cout<<"pT["<<i++<<"] = "<<pT[i]<<endl);

    for(int i=0;i<sT;++i)
        pT[i] =i;
    for(int i=0;i<sT;++i)
        cout<<"pT["<<i<<"] = "<<pT[i]<<endl;

    /// pT[i] <=> *(pT+i) <=> *(i+pT) <=> i[pT]


    cout<<"****************"<<endl;
    cout<<"pT[0] = "<<0[pT]<<endl;

    delete[] pT;
    return 0;
    }
