package com.recursion;

import java.util.Stack;

public class ReverseStack {

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
        System.out.println(stack.peek());
        reverseStack(stack);
        System.out.println(stack);
    }

    public static void reverseStack(Stack stack){
        if(stack.size()==1){
            return;
        }
        int temp = (int) stack.pop();
        reverseStack(stack);
        insertAtFirst(stack,temp);
    }

    public static void insertAtFirst(Stack stack, int temp){
        if(stack.isEmpty()){
            stack.push(temp);
            return;
        }

        int v= (int)stack.pop();
        insertAtFirst(stack,temp);
        stack.push(v);
    }
}
