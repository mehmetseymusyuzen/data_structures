package simple_sorting_algorithms.bubble_sort;

import java.util.Random;

public class BubbleSortTest {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(100);
        }

        BubbleSort b = new BubbleSort(arr);

        b.print();
        b.bubbleSort();
        b.print();

    }
}
