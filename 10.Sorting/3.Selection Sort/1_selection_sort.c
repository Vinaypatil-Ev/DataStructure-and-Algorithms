#include<stdio.h>

void show(int arr[], int size, char* msg) {
    printf("%s\n", msg);
    for (int i=0; i<size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int getMinIndex(int arr[], int start, int end) {
    int i = start;
    int index = i;
    while (i<end) {
        if (arr[i] < arr[index]) {
            index = i;
        }
        i++;
    }
    return index;
}

void swap(int arr[], int x, int y) {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
}

void selSort(int arr[], int size) {
    for (int i=0; i<size; i++) {
        int min = getMinIndex(arr, i, size);
        swap(arr, i, min);
    }
}

int main() {
    int arr[] = {128, 1, 18, 9, 0, 11, 22};
    int size = sizeof(arr) / sizeof(int);
    show(arr, size, "before");
    selSort(arr, size);
    show(arr, size, "after");
}