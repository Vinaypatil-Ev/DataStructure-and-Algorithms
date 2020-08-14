#include<stdio.h>
int main(){
    float array[9]={3,1,2,7,9,5,0,8,3};
    int i,max,index;
    //maximum no in array
    max=array[0];
    for(i=1;i<9;i++){
        if (array[i]>max){
            max=array[i];
            index=i;
        }
    }
    printf("maximum no in array is: %d at loction: %d",max,index);
    return 0;
}