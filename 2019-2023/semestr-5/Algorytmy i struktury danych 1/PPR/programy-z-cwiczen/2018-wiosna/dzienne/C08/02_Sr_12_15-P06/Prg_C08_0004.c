#include<stdio.h>
#include<stdlib.h>
/*********************************************************************/
/*********************************************************************/
typedef int (*ptrMyCom)(int, int);
/*********************************************************************/
/*********************************************************************/
int MyRead();
int MyAdd(int, int);
int MyMul(int, int);
/*********************************************************************/
/*********************************************************************/
int MyRead(){
    int x;
    printf("x ?=");
    scanf("%d", &x);

    return x;
    }
/*********************************************************************/
int MyAdd(int x, int y){
    return x+y;
    }
/*********************************************************************/
int MyMul(int x, int y){
    return x*y;
    }
/*********************************************************************/
/*********************************************************************/
int main(){
    ptrMyCom * myT;
    int i;

    myT=(ptrMyCom*)malloc(sizeof(ptrMyCom)*4);

    myT[0] = MyAdd;
    myT[1] = MyMul;
    myT[2] = MyMul;
    myT[3] = MyAdd;

    for(i=0;i<4;++i)
        printf("result = %d\n",myT[i](2*i,i+5));

    return 0;
    }










