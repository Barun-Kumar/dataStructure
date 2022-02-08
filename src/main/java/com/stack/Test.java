package com.stack;

import java.util.Stack;

public class Test {
    public static void main(String[] args) throws Exception {
        ArrayStack stack = new ArrayStack(5);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(15);
        stack.printStack();
        stack.pop();
        stack.pop();
        stack.printStack();
        System.out.println(stack.isEmpty());
        System.out.println(stack.poll());
        System.out.println(stack.poll());
        stack.printStack();
        System.out.println(stack.top());

        Stack<Integer> s = new Stack<>();
        s.size();
        s.pop();
    }
}
