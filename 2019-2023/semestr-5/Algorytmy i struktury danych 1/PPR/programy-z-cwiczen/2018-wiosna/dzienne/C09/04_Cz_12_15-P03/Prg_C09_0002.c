#include <stdio.h>
#include <stdlib.h>
/********************************************************************/
/********************************************************************/
int MyRead();
void MySwap(int*, int*);
int* MyTabIntX01(int*);/** 3b, 4b, 5b */
/** 4, 5, 6 */

/********************************************************************/
/********************************************************************/
int MyRead(){
    int x;
    printf("x ?=");
    scanf("%d",&x);

    return x;
    }
/********************************************************************/
void MySwap(int* a, int* b){
    int tmp;
    tmp=*a;
    *a=*b;
    *b=tmp;
    }
/********************************************************************/
int* MyTabIntX01(int* sT){
    *sT =MyRead();
    return (int*)malloc(sizeof(int)**sT);
    }
/********************************************************************/
/********************************************************************/
int main(){
    int *mT1, sT1;

    mT1 = MyTabIntX01(&sT1);

    free(mT1);
    return 0;
    }
