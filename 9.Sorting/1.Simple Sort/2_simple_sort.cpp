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

void siSort(int arr[], int size) {
    for (int i=0; i<size; i++) {
        for (int j=i+1; j<size; j++) {
            if (arr[i] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

        }
    }
}

int main() {
    int arr[] = {128, 1, 42, 9, 11, 2, 22};
    int size = sizeof(arr) / sizeof(int);
    show(arr, size, "before");
    siSort(arr, size);
    show(arr, size, "after");
}