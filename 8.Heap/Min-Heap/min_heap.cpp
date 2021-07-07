#include <iostream>
#include <climits>

using namespace std;

class Heap {
    private:
    int *arr;
    int maxsize;
    int size;
    public:
    Heap(int size) {
        this->maxsize = size;
        this->size = 0;
        this->arr = new int[this->maxsize];
    }

    void swap(int *x, int *y) {
        int temp = *x;
        *x = *y;
        *y = temp;
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

    void heapify(int i) {
        int l = left(i);
        int r = right(i);
        int smallest = i;
        if (l<size && arr[l] < arr[r]) {
            smallest = l;
        }
        if (r<size && arr[r] < arr[smallest]) {
            smallest = r;
        }
        if (smallest != i) {
            swap(&arr[i], &arr[smallest]);
            heapify(smallest);
        }
    }

    void insertKey(int key) {
        if (size == maxsize) {
            printf("heap overflow, insertion failed {%d}\n", key);
            return;
        }
        //first insert new element at end
        size++;
        int i = size - 1;
        arr[i] = key;

        //fix mean heap property if it is violetd

        while (i != 0 && arr[parent(i)] > arr[i]) {
            swap(&arr[i], &arr[parent(i)]);
            i = parent(i);
        }
    }

    void deleteKey(int no);

    void showArr() {
        for (int i=0; i < maxsize; i++) {
            cout << arr[i] << " ";
        }
        cout << endl;
    }

    int extractMin() {
        if (size <= 0) {
            return INT_MAX;
        }
        if (size == 1) {
            size--;
            return arr[0];
        }
        // store minimum value and store it from heap
        int root = arr[0];
        arr[0] = arr[size - 1];
        size--;
        heapify(0);
        return root;

    }
};

int main() {
    Heap x(8);
    x.insertKey(1);
    x.insertKey(5);
    x.insertKey(6);
    x.insertKey(4);
    x.insertKey(3);
    x.insertKey(0);
    x.insertKey(8);
    x.insertKey(2);
    x.showArr();
    x.extractMin();
    x.showArr();
    x.extractMin();
    x.showArr();
}