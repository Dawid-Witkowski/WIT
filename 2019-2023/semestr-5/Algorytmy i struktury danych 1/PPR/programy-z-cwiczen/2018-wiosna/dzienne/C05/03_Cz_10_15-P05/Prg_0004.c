#include <stdio.h>
#include <stdlib.h>

int main(){
    int * px;
    int ps;

    ps = sizeof(int);

    printf("size of int = %d\n", sizeof(int));

    px = malloc(sizeof(int));

    *px = 12;
    printf("x = %d\n", *px);


    return 0;
    }
