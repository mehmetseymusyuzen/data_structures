package queue;

import java.util.Arrays;

public class Queue {
    int[] queue;
    int size;

    public Queue(int capacity) {
        queue = new int[capacity];
        size = 0;
    }

    public void push(int a) {
        if (size >= queue.length) {
            System.out.println("Queue is full");
            return;
        }
        queue[size++] = a;
    }

    public int pop() {
        int r = queue[0];
        for (int i = 0; i < size - 1; i++) {
            queue[i] = queue[i + 1];
        }
        queue[--size] = 0;

        return r;
    }


    public void print() {
        System.out.println(Arrays.toString(queue));
    }
}
