class InsertionSort {
    void show(int arr[], String msg) {
        System.out.println(msg);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void insSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j+1] = arr[j];
                j--; 
            }
            arr[j+1] = current;
        }
    } 

    public static void main(String arg[]) {
        int arr[] = {22, 1, 18, 0, 42, 1, 9};
        InsertionSort o = new InsertionSort();
        o.show(arr, "before");
        o.insSort(arr);
        o.show(arr, "after");
    }
}
