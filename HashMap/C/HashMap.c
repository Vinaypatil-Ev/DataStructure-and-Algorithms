#include<stdio.h>
#include<conio.h>

#define size 10

void main(){
    int hashMap[size] ,key;
    int values[size] = {12, 121, 543, 906, 898, 7087, 345, 44, 100, 99};

    for (int i = 0; i < size; i++)
    {
        key = hashKey(values[i]);
        hashMap[key] = values[i] ;
    }

    printHashMap(hashMap);


}

int hashKey(int value){
    return value % 10;
}

void printHashMap(int hashMap[]){
    for (int i = 0; i < size; i++)
    {
        printf("%d\n", hashMap[i]);
    }
}