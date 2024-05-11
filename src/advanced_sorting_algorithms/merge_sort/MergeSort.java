package advanced_sorting_algorithms.merge_sort;

import java.util.Arrays;

public class MergeSort {

    int[] arr;

    public MergeSort(int[] arr) {
        this.arr = arr;
    }

    public void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public void merge(int[] arr, int l, int m, int r) {
        int i = l;
        int j = m + 1;

        int[] tmp = new int[r - l + 1];
        int k = 0;

        while (i <= m && j <= r) {
            if (arr[i] < arr[j]) {
                tmp[k] = arr[i];
                i++;
            } else {
                tmp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= m) {
            tmp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= r) {
            tmp[k] = arr[j];
            j++;
            k++;
        }

        for (i = 0; i < tmp.length; i++) {
            arr[l++] = tmp[i];
        }
    }

    public void print() {
        System.out.println(Arrays.toString(arr));
    }
}
