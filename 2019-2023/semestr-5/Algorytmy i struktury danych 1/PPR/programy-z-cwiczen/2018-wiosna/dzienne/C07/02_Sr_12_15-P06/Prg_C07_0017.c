#include <stdio.h>
/************************************************************************/
/************************************************************************/
int MyRead();
int Max2(int, int);/** 1, 2 */
/** 2b, 3b, 4b  */
int MyMax3(int, int, int);
int MyMax4(int, int, int, int);
int MyMax5(int, int, int, int, int);
int MyMax6(int, int, int, int, int, int);
int MyMax7(int, int, int, int, int, int, int);
int MyMax8(int, int, int, int, int, int, int, int);
int MyMax9(int, int, int, int, int, int, int, int, int);
/************************************************************************/
/************************************************************************/
int MyRead(){
    int x;
    printf("x ?=");
    scanf("%d", &x);

    return x;
    }
/************************************************************************/
int Max2(int x1, int x2){
    if(x1>x2) return x1;
    return x2;
    }
/************************************************************************/
int MyMax3(int x1, int x2, int x3){
    return Max2(Max2(x1,x2),x3);
    }
/************************************************************************/
int MyMax4(int x1, int x2, int x3, int x4){
    return Max2(MyMax3(x1,x2,x4),x3);
    }
/************************************************************************/
int MyMax5(int x1, int x2, int x3, int x4, int x5){
    return Max2(MyMax4(x1,x2,x4,x5),x3);
    }
/************************************************************************/
int MyMax6(int x1, int x2, int x3, int x4, int x5, int x6){
    return Max2(MyMax5(x1,x2,x4,x5,x6),x3);
    }
/************************************************************************/
int MyMax7(int x1, int x2, int x3, int x4, int x5, int x6, int x7){
    return Max2(MyMax6(x1,x2,x4,x5,x6,x7),x3);
    }
/************************************************************************/
int MyMax8(int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8){
    return Max2(MyMax7(x1,x2,x4,x5,x6,x7,x8),x3);
    }
/************************************************************************/
int MyMax9(int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, int x9){
    return Max2(MyMax8(x1,x2,x4,x5,x6,x7,x8,x9),x3);
    }
/************************************************************************/
/************************************************************************/
int main(){
    printf("Max = %d\n",MyMax9(MyRead(),
                               MyRead(),
                               MyRead(),
                               MyRead(),
                               MyRead(),
                               MyRead(),
                               MyRead(),
                               MyRead(),
                               MyRead()));

    return 0;
    }
