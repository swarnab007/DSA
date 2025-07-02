package com.swarnab;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int top = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size]
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean push(int item) {
        if(isFull) {
            System.out.println("Stack is Full");
            return false;
        }
        top++;
        data[top] = item;
        return true;
    }

    public int pop() throws StackException {
        if(isEmpty()) {
            throw new StackException("Can not Pop from an Empty Stack");
        }
        return data[top--];
    }

    public int peek() throws StackException {
        if(isEmpty()) {
            throw new StackException("Can not Pop from an Empty Stack");
        }
        return data[top];
    }
}
