package simple_sorting_algorithms.insertion_sort;

import java.util.Arrays;

public class InsertionSort {

    int[] arr;

    public InsertionSort(int[] array) {
        arr = array;
    }

    public void insertionSort() {
        int t = 0, j = 0;
        for (int i = 0; i < arr.length; i++) {
            t = arr[i];
            for (j = i; j > 0 && arr[j - 1] > t; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = t;
        }
    }

    public void print() {
        System.out.println(Arrays.toString(arr));
    }

}
