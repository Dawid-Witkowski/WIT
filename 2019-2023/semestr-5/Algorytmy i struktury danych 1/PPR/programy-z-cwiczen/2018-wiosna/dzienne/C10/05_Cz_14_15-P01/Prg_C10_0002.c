#include <stdio.h>
#include <stdlib.h>
/*********************************************************/
/*********************************************************/
int MyRead();
/*********************************************************/
/*********************************************************/
int MyRead(){
    int x;
    printf("x ?=");
    scanf("%d", &x);

    return x;
    }
/*********************************************************/
/*********************************************************/
int main(){
    char* mT;
    char* mT2 ="Ala ma kota";
    int i;

    mT=(char*)malloc(sizeof(char)*12);

    mT[0]='A';
    mT[1]='l';
    mT[2]='a';
    mT[3]=' ';
    mT[4]='m';
    mT[5]='a';
    mT[6]=' ';
    mT[7]='k';
    mT[8]='o';
    mT[9]='t';
    mT[10]='a';
    mT[11]='\0';

    printf("%s\n",mT);
    printf("%s\n",mT2);
    mT2[0]='O';
    printf("\n*******************\n");
    printf("%s\n",mT);
    printf("%s\n",mT2);

    return 0;
    }







