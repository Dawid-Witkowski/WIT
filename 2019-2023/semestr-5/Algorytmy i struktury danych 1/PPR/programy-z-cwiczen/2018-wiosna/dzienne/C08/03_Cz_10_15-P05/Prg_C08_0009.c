#include <stdio.h>
/***************************************************************************************************/
/***************************************************************************************************/
int MyRead();
/**  4b, 5b, 6b
*/
void MySqr(int, void (*mL)(int));
void MyLine(int);
void GrowLine(int);
void Triangle(int);
/***************************************************************************************************/
/***************************************************************************************************/
int MyRead(){
    int x;
    printf("x ?=");
    scanf("%d", &x);

    return x;
    }
/***************************************************************************************************/
/***************************************************************************************************/
void MySqr(int x, void (*mL)(int)){
    int i;
    for(i=0; i<x;++i){
        mL(x);
        printf("\n");
        }
    }
/***************************************************************************************************/
void MyLine(int x) {
    int i;
    for(i=0; i<x;++i){
        printf("* ");
        }
    }
/***************************************************************************************************/
void GrowLine(int x){
    int i, j;
    for(i=0;i<x;++i){
        for(j=0;j<=i;++j)
            printf("*");
        for(j=0;j<=i;++j)
            printf(" ");
        }
    }
/***************************************************************************************************/
void Triangle(int x){
    int i;
    for(i=0; i<x;++i){
        MyLine(i+1);
        printf("\n");
        }
    }
/***************************************************************************************************/
/***************************************************************************************************/
int main(){
    MySqr(MyRead(),Triangle);


    return 0;
    }
