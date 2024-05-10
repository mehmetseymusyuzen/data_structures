package advanced_sorting_algorithms.shell_sort;

import java.util.Arrays;

public class ShellSort {

    int[] arr;

    public ShellSort(int[] arr) {
        this.arr = arr;
    }

    public void shellSort(int[] arr) {
        int tmp = 0;
        int i = 0, j = 0;
        int gap = 0;

        for (gap = arr.length / 2; gap > 0; gap /= 2) {
            for (i = gap; i < arr.length; i += gap) {
                tmp = arr[i];
                for (j = i; j > 0 && arr[j - gap] > tmp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = tmp;
            }
        }

    }


    public void print() {
        System.out.println(Arrays.toString(arr));
    }
}
