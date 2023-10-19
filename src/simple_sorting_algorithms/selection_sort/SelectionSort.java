package simple_sorting_algorithms.selection_sort;

import java.util.Arrays;

public class SelectionSort {

    int[] arr;

    public SelectionSort(int[] array) {
        arr = array;
    }

    public void selectionSort() {
        int min = 0;
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                tmp = arr[min];
                arr[min] = arr[i];
                arr[i] = tmp;
            }
        }
    }

    public void print() {
        System.out.println(Arrays.toString(arr));
    }
}