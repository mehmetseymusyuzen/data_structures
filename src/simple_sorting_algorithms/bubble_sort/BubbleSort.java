package simple_sorting_algorithms.bubble_sort;

import java.util.Arrays;

public class BubbleSort {
    int[] arr;

    public BubbleSort(int[] array) {
        arr = array;
    }

    public boolean isSwapped = true;

    public void bubbleSort() {
        int tmp = 0;

        for (int i = 0; i < arr.length && isSwapped; i++) {
            isSwapped = false;

            for (int j = 0; j < (arr.length - 1) - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    isSwapped = true;

                }
            }
        }
    }

    public void print() {
        System.out.println(Arrays.toString(arr));
    }
}
