#include "A.h"
///**********************************
A::A(int x):x(x){cout<<"Konstruktor A"<<endl;}
///**********************************
string A::ToString(){
    return "A::x = "+to_string(x);
    }
///**********************************
int A::GetX(){return x;}
///**********************************
void A::Aqq(){cout<<"Aqq"<<endl;}
///**********************************
