package advanced_sorting_algorithms.quick_sort;

import java.util.Random;

public class QuickSortTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }

        QuickSort q = new QuickSort(arr);

        q.print();
        q.quickSort(arr, 0, arr.length - 1);
        q.print();

    }
}
