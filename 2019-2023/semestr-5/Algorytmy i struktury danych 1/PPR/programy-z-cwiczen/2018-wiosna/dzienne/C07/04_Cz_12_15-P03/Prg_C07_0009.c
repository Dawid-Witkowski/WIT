#include <stdio.h>
/******************************************************************/
/******************************************************************/
int MyRead();
void BlackLine(int);
void WhiteLine(int);
void MySquare(int);
void MyTriangle(int);
/**  3b, 4b, 5b
        *
      * *
    * * *
  * * * *
* * * * *
*/
/******************************************************************/
/******************************************************************/
int MyRead(){
    int x;

    printf("x ?=");
    scanf("%d", &x);

    return x;
    }
/******************************************************************/
void BlackLine(int x){
    int j;
    for(j=0; j<x; ++j)
        printf("* ");
    }
/******************************************************************/
void WhiteLine(int x){
    int j;
    for(j=0; j<x; ++j)
        printf("  ");
    }
/******************************************************************/
void MySquare(int x){
    int i;
    for(i=0; i<x;++i){
        BlackLine(x);
        printf("\n");
        }
    }
/******************************************************************/
void MyTriangle(int x){
    int i;
    for(i=0; i<x;++i){
        WhiteLine(x-i-1);
        BlackLine(i+1);
        printf("\n");
        }
    }
/******************************************************************/
/******************************************************************/
int main(){

    MyTriangle(MyRead());

    return 0;
    }
