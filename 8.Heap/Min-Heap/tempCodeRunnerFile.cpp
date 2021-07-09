
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

    void showHeap() {
        for (int i=0; i<maxsize; i++) {
            cout << arr[i] << " ";
        }
        cout << endl;
    }
}

int main() {
    MinHeap h(5);
    h.insert(10);
    h.insert(50);
    h.insert(20);
    h.insert(1);
    h.insert(25);
}