#include <iostream>
using namespace std;
///*******************************************************************************
///*******************************************************************************
int MyRead(int);
int* NewTabInt01(unsigned);
///*******************************************************************************
///*******************************************************************************
int MyRead(int i){
    int x;
    cout<<"x"<<i<<" ?=";
    cin>>x;

    return x;
    }
///*******************************************************************************
int* NewTabInt01(unsigned sT){
    return new int[sT];
    }
///*******************************************************************************
///*******************************************************************************
int main(){
    int * t;
    unsigned sT = 4;
    t = NewTabInt01(sT);

    delete[] t;
    return 0;
    }
