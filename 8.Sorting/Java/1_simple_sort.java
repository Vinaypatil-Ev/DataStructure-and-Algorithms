class SimpleSort {
    void siSort(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
    }
    void show(int arr[], String msg) {
        System.out.println(msg);
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String args[]) {
        int arr[] = {22, 18, 2, 42, 1, 10, 0};
        SimpleSort o = new SimpleSort();
        // SimpleSort o = new SimpleSort(System.in);
        o.show(arr, "before");
        o.siSort(arr);
        o.show(arr, "after");

    }
}