package com.recursion;

import java.util.Stack;

public class DeleteMidElementFromStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        System.out.println(stack);
        int mid= stack.size()/2;
        deleteMidElement(stack,mid+1);
        System.out.println(stack);
    }

    private static void deleteMidElement(Stack<Integer> stack, int mid) {
        if(stack.size()==mid){
            stack.pop();
            return;
        }
        int v = stack.pop();
        deleteMidElement(stack,mid);
        stack.push(v);
    }
}
