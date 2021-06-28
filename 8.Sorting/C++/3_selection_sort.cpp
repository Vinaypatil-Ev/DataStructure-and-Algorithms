#include <iostream>
#include <string>

using namespace std;

void show(int arr[], int size, string msg) {
    cout << msg << endl;
    for (int i=0; i<size; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int getMinIndex(int arr[], int start, int end) {
    int i = start;
    int index = i + 1;
    while (i < end) {
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
    for (int i=0; i<size-1; i++) {
        int min = getMinIndex(arr, i, size);
        swap(arr, i, min);
    }
}

int main() {
    int arr[] = {128, 1, 18, 42, 0, 11, 22};
    int size = sizeof(arr) / sizeof(int);
    show(arr, size, "before");
    selSort(arr, size);
    show(arr, size, "after");
}