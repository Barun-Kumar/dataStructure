package com.recursion;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(2);
        stack.push(9);
        stack.push(1);
        stack.push(5);
        System.out.println(stack);
        sortStack(stack);
        System.out.println(stack);
    }
    public static void sortStack(Stack<Integer> stack) {
        if (stack.size() == 1)
            return;
        int temp = stack.pop();
        sortStack(stack);
        insert(stack, temp);
    }
    private static void insert(Stack<Integer> stack, int temp) {
        if (stack.isEmpty() || stack.peek() <= temp) {
            stack.push(temp);
            return;
        }
        int val = stack.pop();
        insert(stack, temp);
        stack.push(val);
    }
}
