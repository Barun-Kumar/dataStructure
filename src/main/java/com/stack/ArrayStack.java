package com.stack;

import java.util.Arrays;

public class ArrayStack {
    private int[] stack;
    private int top;
    public ArrayStack(int initialSizeOfStack){
        this.stack = new int[initialSizeOfStack];
        this.top=-1;
    }

    /**
     * Add element in the stack
     */
    public void push(int n){
        if(top == stack.length-1){
            System.out.println("Stack is overflow, Increasing the size of the stack");
            stack=Arrays.copyOf(stack,stack.length*2);
        }
        stack[++top]=n;
    }

    /**
     * Delete the top element from stack
     */
    public void pop() throws Exception{
        if(top==-1){
            throw new Exception("Stack is empty, Can not pop from empty stack");
        }else {
            --top;
        }
    }

    /**
     * Return the top element without deleting it
     * @throws Exception
     * @return top of the stack
     */
    public int top() throws Exception{
        if(top==-1){
            throw new Exception("Stack is empty");
        }else {
            return stack[top];
        }
    }

    /**
     * Check if stack is empty
     * @return Return true if stack is empty otherwise false
     */
    public boolean isEmpty(){
        return top==-1?true:false;
    }

    /**
     * Delete the top element from the stack and return it;
     * @return Top of the stack
     * @throws Exception
     */
    public int poll() throws Exception{
        if(top==-1){
            throw new Exception("Stack is empty, Can not pop from empty stack");
        }else {
            int t=stack[top];
            top--;
            return t;
        }
    }

    public void printStack(){
        if(top==-1){
            return;
        }
        for(int i=0;i<=top;i++){
            System.out.println(stack[i]);
        }
    }



}
