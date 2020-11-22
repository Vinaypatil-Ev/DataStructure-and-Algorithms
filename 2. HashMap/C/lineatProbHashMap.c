#include<stdio.h>
#include<conio.h>

#define size 10

void main(){

    int hashMap[size], key, value;
    int isFull = 0;

    for (int i = 0; i < size; i++)
    {
        hashMap[i] = -1;
    }

    do{
        if(isFull == size){
            printf("breaking");
            sleep(4);
            // break;
        }
        scanf("%d", &value);
        key = linearProbKey(value, hashMap);
        hashMap[key] = value;
        isFull++;
        printf("value: %d | key: %d ", value, key);
        printHashMap(hashMap);

    }while(value != -1);

    scanf("print something to close...");
    getch();


}
int linearProbKey(int value, int hashMap[]){
    int key;
    for (int i = 0; i <= 1; i++)
    {
        key = value % size + 1;
        printf("In key: %d ", key);
        if(hashMap[key] == -1){
            printf(" Not\n");
            sleep(3);
            return key;
        }
    }
    printf("zero");
    return 0;
    
}

void printHashMap(int hashMap[]){
    printf("Hash Map: ");
    for (int i = 0; i < size; i++)
    {
        printf("|%d|", hashMap[i]);
    }
    
}

