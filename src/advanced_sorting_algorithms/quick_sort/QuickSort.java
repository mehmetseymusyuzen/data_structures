package advanced_sorting_algorithms.quick_sort;

import java.util.Arrays;

public class QuickSort {
    int[] arr;

    public QuickSort(int[] arr) {
        this.arr = arr;
    }

    public void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int pivotIndex = partition(arr, l, r);
            quickSort(arr, l, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, r);
        }
    }

    public int partition(int[] arr, int l, int r) {
        int pivotIndex = r;
        int i = l;
        int j = r - 1;

        do {
            while (arr[i] < arr[pivotIndex] && i < r) i++;
            while (arr[j] > arr[pivotIndex] && j > 0) j--;
            if (i < j) swap(arr, i, j);
        } while (i < j);

        swap(arr, i, pivotIndex);

        return i;
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public void print() {
        System.out.println(Arrays.toString(arr));
    }
}
