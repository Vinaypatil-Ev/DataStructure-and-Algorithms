#include <stdio.h>

void show(int arr[], int size, char* msg) {
    printf("%s\n", msg);
    for (int i=0; i<size, i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

void merge(int arr[], int start, int mid, int end) {
    int l = mid - start + 1;
    int r = end - mid;
    
}

void mergeSort(int arr[], int start, int end) {
    if (start < end) {
        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }
}

int main() {
    int arr[] = {128, 1, 18, 9, 0, 11, 22};
    int size = sizeof(arr) / sizeof(int);
    show(arr, size, "before");
    mergeSort(arr, 0, size-1);
    show(arr, size, "after");
}