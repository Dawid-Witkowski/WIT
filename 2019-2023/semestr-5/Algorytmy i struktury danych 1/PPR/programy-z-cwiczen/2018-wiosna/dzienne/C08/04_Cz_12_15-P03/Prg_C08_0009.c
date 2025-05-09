#include<stdio.h>
#include<stdlib.h>
/******************************************************************************/
/******************************************************************************/
int MyRead();
int MyMax(int, int);
int MyMin(int, int);
int MyAdd(int, int);
int MyPrint(int, int);
/** 3b, 4b, 5b */
int MyEx(int, int, int(*mE)(int, int));
/******************************************************************************/
/******************************************************************************/
int MyRead(){
    int x;
    printf("x ?=");
    scanf("%d", &x);

    return x;
    }
/******************************************************************************/
int MyMax(int x, int y){
    if(x>y) return x;
    return y;
    }
/******************************************************************************/
int MyMin(int x, int y){
    if(x<y) return x;
    return y;
    }
/******************************************************************************/
int MyAdd(int x, int y){
    return x+y;
    }
/******************************************************************************/
int MyEx(int x, int y, int(*mE)(int, int)){
    return mE(x,y);
    }
/******************************************************************************/
int MyPrint(int x, int y){
    printf("x = %d, y= %d\n", x, y);
    return 0;
    }
/******************************************************************************/
/******************************************************************************/
int main(){
    int x, y;
    x =MyRead();
    y =MyRead();

    printf("Max(%d, %d) = %d\n", x, y, MyEx(x, y, MyMax));
    printf("Min(%d, %d) = %d\n", x, y, MyEx(x, y, MyMin));
    printf("Sum(%d, %d) = %d\n", x, y, MyEx(x, y, MyAdd));
    MyEx(x, y, MyPrint);

    return 0;
    }
