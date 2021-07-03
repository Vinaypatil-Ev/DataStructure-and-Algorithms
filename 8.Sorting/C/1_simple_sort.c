#include<stdio.h>

void show(int arr[], int size, char* msg) {
    printf("%s\n", msg);
    for (int i=0; i<size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

void siSort(int arr[], int size) {
    for (int i=0; i<size; i++) {
        for (int j=i+1; j<size; j++) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}

int main() {
    int arr[] = {128, 1, 18, 9, 0, 11, 22};
    int size = sizeof(arr) / sizeof(int);
    show(arr, size, "before");
    siSort(arr, size);
    show(arr, size, "after");

}