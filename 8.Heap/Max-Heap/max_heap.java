class MaxHeap {
    private int arr[];
    private int size;
    private int maxsize;
    
    public MaxHeap(int maxsize) {
        this.maxsize = maxsize;
        this.arr = new int[this.maxsize + 1];
        this.size = 0;
    }

    void swap(int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
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

    void insertKey(int key) {
        if (size == maxsize) {
            System.out.format("Heap overload, insertion failed {%d}\n", key);
            return;
        }
        arr[++size] = key;
        int current = size;
        while (arr[current] > arr[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    void showHeap() {
        for (int i=0; i<maxsize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        MaxHeap h = new MaxHeap(5);
        h.insertKey(10);
        h.insertKey(90);
        h.insertKey(12);
        h.insertKey(1);
        h.insertKey(9);
        h.insertKey(45);
        h.insertKey(32);
        h.showHeap();
    }
}