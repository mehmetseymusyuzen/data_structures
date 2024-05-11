package advanced_sorting_algorithms.merge_sort;

import java.util.Random;

public class MergeSortTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(100);
        }

        MergeSort m = new MergeSort(arr);

        m.print();
        m.mergeSort(arr, 0, arr.length - 1);
        m.print();
    }
}
