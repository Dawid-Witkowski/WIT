#include<stdio.h>
/******************************************************************************/
/******************************************************************************/
typedef void (*ptrMyText)();
typedef int (*ptrMyComp)(int, int);
/******************************************************************************/
/******************************************************************************/
void MyText();
void MyText1();
void MyText2();
int MyAdd(int, int);
int MyMul(int, int);
/******************************************************************************/
/******************************************************************************/
void MyText(){
    printf("\n\n************* MyText ***********\n");
    printf("******************    ");
    MyText1();
    printf("******************    ");
    MyText2();
    }
/******************************************************************************/
void MyText1(){
    printf("---------> MyText1\n");
    }
/******************************************************************************/
void MyText2(){
    printf(">>>>>>>>>> MyText2\n");
    }
/******************************************************************************/
int MyAdd(int x, int y){
    return x + y;
    }
/******************************************************************************/
int MyMul(int x, int y){
    return x * y;
    }
/******************************************************************************/
/******************************************************************************/
int main(){
    ptrMyComp mT;
    mT= MyMul;
    printf("result = %d", mT(2,3));
    return 0;
    }
