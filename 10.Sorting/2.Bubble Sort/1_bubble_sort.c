#include<stdio.h>

void show(int arr[], int size, char* msg) {
    printf("%s\n", msg);
    for (int i=0; i<size; i++) {
        printf("%s ", arr[i]);
    }
    printf("\n");
}

void bblSort(int arr[], int size) {
    for (int i=size-1; i>0; i--) {
        for (int j=size-1; i>0; j--) {
            if (arr[j] < arr[j-1]) {
                int temp = arr[i];
                arr[j-1] = arr[i];
                arr[i] = temp;
            }
        }
    }
}

int main() {
    int arr[] = {128, 1, 18, 9, 0, 11, 22};
    int size = sizeof(arr) / sizeof(int);
    show(arr, size, "before");
    bblSort(arr, size);
    show(arr, size, "after");
    
}