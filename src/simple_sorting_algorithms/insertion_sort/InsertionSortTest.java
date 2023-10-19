package simple_sorting_algorithms.insertion_sort;

import java.util.Random;

public class InsertionSortTest {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(100);
        }

        InsertionSort i = new InsertionSort(arr);

        i.print();
        i.insertionSort();
        i.print();
    }
}
