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

void insSort(int arr[], int size) {
    for (int i=1; i<size; i++) {
        int current = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > current) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = current;
    }
}

int main() {
    int arr[] = {22, 1, 18, 42, 0, 9, 128};
    int size = sizeof(arr) / sizeof(int);
    show(arr, size, "before");
    insSort(arr, size);
    show(arr, size, "after");
}