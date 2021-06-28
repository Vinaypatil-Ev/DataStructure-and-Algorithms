#include<stdio.h>
#include<stdbool.h>
#define size 4
int main(){
    // declare array
    // datatype arr_name[size] = {values...}
    int a[size] = {1, 3, 4, 5};
    float b[size]={2.3, 9.23, 0.22, 92};
    char c[]={'a', 'b', 'c', 'd'};
    double d[size]={5.40, 9.00009};
    char bytes[]={0x43,0x4d,0x30,0x30,0x0f,0x0D}; 
    bool e[size] = {true, false, true, false};
    char s[size][size] = {"str1", "str2"};
    return 0;
}