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

void bblSort(int arr[], int size) {
    for (int i=size-1; i>0; i--) {
        for (int j=size-1; j>0; j--) {
            if (arr[j] < arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }

        }
    }
}

int main() {
    int arr[] = {128, 1, 42, 9, 11, 2, 22};
    int size = sizeof(arr) / sizeof(int);
    show(arr, size, "before");
    bblSort(arr, size);
    show(arr, size, "after");
}