package advanced_sorting_algorithms.shell_sort;

import java.util.Random;

public class ShellSortTest {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(100);
        }

        ShellSort s = new ShellSort(arr);

        s.print();
        s.shellSort(arr);
        s.print();
    }
}
