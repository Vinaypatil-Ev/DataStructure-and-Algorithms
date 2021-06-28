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

void merge(int arr[], int start, int mid, int end) {
    int l = mid - start + 1;
    int r = end - mid;
    int *templ = new int(l);
    int *tempr = new int(r);
    
    for (int i=0; i<l; i++) {
        templ[i] = arr[start + i];
    }
    for (int i=0; i<r; i++) {
        tempr[i] = arr[mid + i + 1];
    }

    int i, j, k;
    i = j = 0;
    k = start;

    while (i < l && j < r) {
        if (templ[i] < tempr[j]) {
            arr[k] = templ[i];
            i++;
        } else {
            arr[k] = tempr[j];
            j++;
        }
        k++;
    }

    while (i < l) {
        arr[k] = templ[i];
        i++;
        k++;
    }

    while (j < r) {
        arr[k] = tempr[j];
        j++;
        k++;
    }

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
    int arr[] = {22, 1, 18, 9, 42, 0, 11};
    int size = sizeof(arr) / sizeof(int);
    show(arr, size, "before");
    mergeSort(arr, 0, size-1);
    show(arr, size, "after");

} 