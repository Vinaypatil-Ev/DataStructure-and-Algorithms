#include <iostream>
#include <cstdlib>
// #define Maxval 100

using namespace std;
int main() {
    int n;
    cout << "Enter the length of arr to sort: ";
    cin >> n;
    // declare the array
    int arr[n]; 
    // create random int arr of length n
    for (int i=0; i<n; i++) {
        arr[i] = rand();
    }
    // print array
    for (int i=0; i<n; i++) {
        cout << arr[i] << " ";
    } 
    cout << endl;
    // sorting array ascending order
    int temp;
    for (int i=0; i<n; i++) {
        for (int j=i+1; j<n; j++) {
            if (arr[i] > arr[j]) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            } 
        }
    }
    // print array
    cout << "sorted array\n";
    for (int i=0; i<n; i++) {
        cout << arr[i] << " ";
    } 
    cout << endl;
    return 0;
}