class MergeSort {
    void show(int arr[], String msg) {
        System.out.println(msg);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void merge(int arr[], int start, int mid, int end) {
        int l = mid - start + 1;
        int r = end - mid;
        int templ[] = new int[l];
        int tempr[] = new int[r];
        for (int i = 0; i < templ.length; i++) {
            templ[i] = arr[start + i];
        }
        for (int i = 0; i < tempr.length; i++) {
            tempr[i] = arr[mid + i + 1];
        }

        int i = 0;
        int j = 0;
        int k = start;

        while (i < templ.length && j < tempr.length) {
            if (templ[i] < tempr[j]) {
                arr[k] = templ[i];
                i++;
            } else {
                arr[k] = tempr[j];
                j++;
            }
            k++;
        }

        while (i < templ.length) {
            arr[k] = templ[i];
            i++;
            k++;
        }

        while (j < tempr.length) {
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

    public static void main(String arg[]) {
        int arr[] = {22, 1, 9, 46, 0, 55, 3};
        MergeSort o = new MergeSort();
        o.show(arr, "before");
        o.mergeSort(arr, 0, arr.length - 1);
        o.show(arr, "after");

    }
}
