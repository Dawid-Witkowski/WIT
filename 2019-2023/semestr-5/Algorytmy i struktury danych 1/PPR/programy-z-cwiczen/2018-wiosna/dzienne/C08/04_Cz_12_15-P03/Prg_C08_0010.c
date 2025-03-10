#include<stdio.h>
#include<stdlib.h>
/******************************************************************************/
/******************************************************************************/
int MyRead();
void MyFig(int, void(*mL)(int));
void MyLine(int);
void GrowLine(int);
void Triangle1(int);
/** 3b, 4b, 5b
MyFig(3 , ...)
* * *
* * *
* * *

MyFig(3 , ...)

 *  **   ***
 *  **   ***
 *  **   ***

MyFig(3 , ...)

* * *
* *
*

* * *
* *
*

* * *
* *
*

*/
/******************************************************************************/
/******************************************************************************/
int MyRead(){
    int x;
    printf("x ?=");
    scanf("%d", &x);

    return x;
    }
/******************************************************************************/
void MyFig(int x, void(*mL)(int)){
    int i;
    for(i=0; i<x;++i){
        mL(x);
        printf("\n");
        }
    }
/******************************************************************************/
void MyLine(int x){
    int i;
    for(i = 0; i<x;++i)
        printf("* ");
    }
/******************************************************************************/
void GrowLine(int x){
    int i,j;
    for(i = 0; i<x;++i){
        for(j=0;j<=i;++j)
            printf(" ");
        for(j=0;j<=i;++j)
            printf("*");
        }
    }
/******************************************************************************/
void Triangle1(int x){
    int i;
    for(i = 0; i<x;++i){
        MyLine(x-i);
        printf("\n");
        }
    }
/******************************************************************************/
/******************************************************************************/
int main(){
    MyFig(MyRead(),MyLine);
    printf("\n\n");
    MyFig(MyRead(),GrowLine);
    printf("\n\n");
    MyFig(MyRead(),Triangle1);
    return 0;
    }
