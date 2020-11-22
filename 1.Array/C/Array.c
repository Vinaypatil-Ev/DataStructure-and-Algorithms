#include<stdio.h>
#define size 9
int main(){
    //definig array(int)
    float array[size]={3,1,2,7,9,5,0,8,3};
    //other arrys can be
    //char array[size]={c,h,a,r}
    //float array[size]={3.4,9.4}
    //double array[size]={5.40,9.00009}

    //maximum no in array and its index
    int i,max,index;
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