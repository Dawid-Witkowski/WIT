#include <stdio.h>
#include <stdlib.h>
/**************************************************************************/
/**************************************************************************/
typedef struct MyN{
    int x;
    struct MyN* next;
    }MyNode;
/**************************************************************************/
/**************************************************************************/
MyNode* PrintNode(MyNode*, char*);
/**************************************************************************/
/**************************************************************************/
int MyRead(char*);
/**************************************************************************/
/**************************************************************************/
MyNode* PrintNode(MyNode* myNode, char* myStr){
    if(myNode==NULL)return NULL;
    printf("%s%d\n", myStr, myNode->x);
    return myNode;
    }
/**************************************************************************/
/**************************************************************************/
int MyRead(char* myStr){
    int x;
    printf("%s", myStr);
    scanf("%d", &x);
    return x;
    }
/**************************************************************************/
/**************************************************************************/
int main(){


    return 0;
    }
















