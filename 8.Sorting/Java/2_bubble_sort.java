class BubbleSort {
    void bblSort(int arr[]) {
        for (int i=arr.length-1; i>0; i--) {
            for (int j=arr.length-1; j>0; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
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

    public static void main(String arg[]) {
        int arr[] = {10, 2, 22, 43, 9, 55, 0};
        BubbleSort o = new BubbleSort();
        o.show(arr, "before");
        o.bblSort(arr);
        o.show(arr, "after");
    }
}
