#include<iostream>
using std::cout;
using std::cin;
using std::endl;
using std::string;
using std::ostream;
using std::istream;
///********************************************************************************************
///********************************************************************************************
class TabIntX01{
    public:
        TabIntX01(int=0);
        TabIntX01(const TabIntX01&);
        ~TabIntX01();
        TabIntX01 operator=(const TabIntX01&);
        int& operator[](int);
        int Length();
    private:
        int  sT;
        int* pT;
    };
///********************************************************************************************
///********************************************************************************************
TabIntX01::TabIntX01(int sT){
    if(sT<1){
        this->sT = 0;
        this->pT = NULL;
        }
    else{
        this->sT = sT;
        this->pT = new int[this->sT];
        }
    }
///********************************************************************************************
TabIntX01::TabIntX01(const TabIntX01& tabIntX01){
    if(tabIntX01.sT<1){
        this->sT = 0;
        this->pT = NULL;
        }
    else{
        this->sT = tabIntX01.sT;
        this->pT = new int[this->sT];
        for(int i=0;i<this->sT;++i)this->pT[i] = tabIntX01.pT[i];
        }
    }
///********************************************************************************************
TabIntX01::~TabIntX01(){
    delete[] pT;
    sT = 0;
    pT = NULL;
    }
///********************************************************************************************
TabIntX01 TabIntX01::operator=(const TabIntX01& tabIntX01){
    delete[]this->pT;
    if(tabIntX01.sT<1){
        this->sT = 0;
        this->pT = NULL;
        }
    else{
        this->sT = tabIntX01.sT;
        this->pT = new int[this->sT];
        for(int i=0;i<this->sT;++i)this->pT[i] = tabIntX01.pT[i];
        }
    return *this;
    }
///********************************************************************************************
int& TabIntX01::operator[](int i){return this->pT[i];}
///********************************************************************************************
int TabIntX01::Length(){return this->sT;}
///********************************************************************************************
///********************************************************************************************
int main(){
    TabIntX01 tabIntX01(10);
    for(int i=0;i<tabIntX01.Length();++i)
        tabIntX01[i]=i+20;

    for(int i=0;i<tabIntX01.Length();++i)
        cout<<tabIntX01[i]<<endl;

    return 0;
    }
