package simple_sorting_algorithms.selection_sort;

import java.util.Random;

public class SelectionSortTest {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(100);
        }

        SelectionSort s = new SelectionSort(arr);

        s.print();
        s.selectionSort();
        s.print();
    }
}
