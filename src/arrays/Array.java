package arrays;

public class Array {
    int[] arr;
    int size;

    public Array(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public void addElement(int a) {
        if (size >= arr.length) {
            System.out.println("Array is full");
            return;
        }
        int i = 0;
        for (i = size - 1; i >= 0 && arr[i] > a; i--) {
            arr[i + 1] = arr[i];
        }
        arr[i + 1] = a;
        size++;
    }

    public int search(int a) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == a) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int a) {
        int index = search(a);
        if (index == -1) {
            System.out.println("number not found!");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = 0;
    }

    public void update(int a, int b) {
        int index = search(a);
        if (index == -1) {
            System.out.println("number not found!");
            return;
        }
        arr[index] = b;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i != size - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }
}
