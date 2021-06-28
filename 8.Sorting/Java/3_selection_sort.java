class SelectionSort {
    int getMinIndex(int arr[], int start) {
        int i = start;
        int index = i;
        while(i < arr.length) {
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

    void selSort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int min = getMinIndex(arr, i);
            swap(arr, i, min);
            i++;
        }

    }

    void show(int arr[], String msg) {
        System.out.println(msg);
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {22, 1, 9, 42, 0, 55, 3};
        SelectionSort o = new SelectionSort();
        o.show(arr, "before");
        o.selSort(arr);
        o.show(arr, "after");

    }
}