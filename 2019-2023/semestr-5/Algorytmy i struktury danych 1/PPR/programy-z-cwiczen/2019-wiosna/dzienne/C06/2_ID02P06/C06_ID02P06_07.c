#include <stdio.h>
///************************************************************************
int MyRead(){
    int x;
    printf("x? = ");
    scanf("%d",&x);
    return x;
    }
///************************************************************************
///************************************************************************
int main(){
    int x;

    x = MyRead();
    printf("x = %d\n",x);

    return 0;
    }
/**1

x? = 5
x = 5

*/

/**
x? = 11
x = 11

*/








