package com.swarnab;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(34);
        stack.push(56);
        stack.push(78);
        stack.push(90);
        stack.push(2);

        stack.pop();
        stack.pop();

        System.out.println(stack.peek());

        // Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(67);
        queue.add(78);
        queue.add(90);
        queue.add(22);


    }
}
