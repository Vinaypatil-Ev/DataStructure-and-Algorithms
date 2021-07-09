#include <iostream>

using namespace std;

class MinHeap {
    private:
    int *arr;
    int maxsize;
    int size;
    public:
    MinHeap(int cap) {
        this->maxsize = cap;
        this->arr = new int[this->maxsize];
        this->size = 0;
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    int left(int i) {
        return i*2 + 1;
    }

    int right(int i) {
        return i*2 + 2;
    }

    void swap(int *x, int *y) {
        int temp = *x;
        *x = *y;
        *y = temp;
    }

    void insert(int key) {
        if (size == maxsize) {
            printf("Heap overflow, insertion failed {%d}", key);
            return;
        }
        //insertion in heap
        size++;
        int i = size - 1;
        arr[i] = key;
        //balace the heap
        while (i != 0 && arr[i] < arr[parent(i)]) {
            swap(&arr[i], &arr[parent(i)]);
            i = parent(i);
        }
    }

    void 

    void showHeap() {
        for (int i=0; i<maxsize; i++) {
            cout << arr[i] << " ";
        }
        cout << endl;
    }
};

int main() {
    MinHeap h(5);
    h.insert(110);
    h.insert(50);
    h.insert(20);
    h.insert(1);
    h.insert(25);
    h.showHeap();
}