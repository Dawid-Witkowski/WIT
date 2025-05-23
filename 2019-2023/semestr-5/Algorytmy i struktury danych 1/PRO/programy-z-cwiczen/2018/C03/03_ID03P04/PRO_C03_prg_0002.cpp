#include<iostream>
using std::cout;
using std::cin;
using std::endl;
using std::string;
///*****************************************************************************************************
///*****************************************************************************************************
class MyA{
    public:
        MyA(int=0, int=0, int=0);
        MyA& MyAIni(int=0, int=0, int=0);
        MyA& MyAPrint();

        int GetX2();
        int GetX1();
        int GetX0();
        int GetCrC();

        int SetX2(int);

    private:
        int CrC();
        int SetCrC();

        int x2;
        int x1;
        int x0;

        int cRc;
    };
///*****************************************************************************************************
///*****************************************************************************************************
int MyRead(string);
int MyRead();
///*****************************************************************************************************
///*****************************************************************************************************
int MyRead(string myStr){
    int x;
    cout<<myStr;
    cin>>x;
    return x;
    }
///*****************************************************************************************************
int MyRead(){
    return MyRead("x? = ");
    }
///*****************************************************************************************************
///*****************************************************************************************************
MyA::MyA(int x2, int x1, int x0){
    MyAIni(x2, x1, x0);
    }
///*****************************************************************************************************
MyA& MyA::MyAIni(int x2, int x1, int x0){
    this->x2 = x2;
    this->x1 = x1;
    this->x0 = x0;
    SetCrC();
    return *this;
    }
///*****************************************************************************************************
MyA& MyA::MyAPrint(){
    cout<<"x2 = "<<x2<<", x1 = "<<x1<<", x0 = "<<x0<<", CRC = "<<cRc<<endl;
    return *this;
    }
///*****************************************************************************************************
int MyA::GetX2(){return x2;}
int MyA::GetX1(){return x1;}
int MyA::GetX0(){return x0;}
int MyA::GetCrC(){return cRc;}
///*****************************************************************************************************
int MyA::SetX2(int x){
    int tmp = x2;
    x2 = x;
    return tmp;
    }
///*****************************************************************************************************


int MyA::CrC(){
    return 4*(x2%2) +2*(x1%2) + x0%2;
    }
///*****************************************************************************************************
int MyA::SetCrC(){
    cRc = CrC();
    return cRc;
    }
///*****************************************************************************************************
///*****************************************************************************************************
int main(){
    MyA myA(1,2,3);
    myA.MyAPrint();
    cout<<"x2  = "<<myA.GetX2()<<endl;
    cout<<"x1  = "<<myA.GetX1()<<endl;
    cout<<"x0  = "<<myA.GetX0()<<endl;
    cout<<"CRC = "<<myA.GetCrC()<<endl;
    return 0;
    }









