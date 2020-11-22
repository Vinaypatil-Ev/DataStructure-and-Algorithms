#include<iostream>

using namespace std;

const int asize = 10;


int hashKey(int value){
    return value % asize;
}

void printHashMap(int hashMap[]){

    for(int i = 0; i < asize; i++){

        cout << hashMap[i] << "|";
    }
}

int main(){


    int hashMap[asize],  key;

    for (int i = 0; i < asize; i++)
    {
        hashMap[i] = -1;
    }
    

    int values[asize] = {16, 23, 12, 34, 44, 59};
    int valSize = sizeof(values) / sizeof(values[0]);
    for (int i = 0; i < valSize; i++)
    {   
        key = hashKey(values[i]);
        hashMap[key] = values[i];
    }

    printHashMap(hashMap);
    
}