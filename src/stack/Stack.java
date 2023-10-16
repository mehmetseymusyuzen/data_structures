package stack;

import java.util.Arrays;

public class Stack {
    int[] stack;
    int size;

    public Stack(int capacity) {
        stack = new int[capacity];
        size = 0;
    }

    public void push(int a) {
        if (size >= stack.length) {
            System.out.println("Stack is full");
            return;
        }
        stack[size++] = a;
    }

    public int pop() {
        int r = stack[size - 1];

        stack[--size] = 0;

        return r;
    }


    public void print() {
        System.out.println(Arrays.toString(stack));
    }
}
