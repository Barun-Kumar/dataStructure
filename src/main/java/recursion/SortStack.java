package recursion;

import utils.ArrayUtils;

import java.util.List;
import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        List<Integer> list =  ArrayUtils.generateRandomList(10,1,20);
        System.out.println(list);
        Stack<Integer> stack= new Stack<>();
        for(Integer i: list){
            stack.push(i);
        }
        System.out.println(stack);
        sort(stack);
        System.out.println(stack);
    }

    public static void sort(Stack<Integer> stack){
        if(stack.size()==1){
            return;
        }
        int temp= stack.pop();
        sort(stack);
        insert(stack,temp);
    }

    public static void insert(Stack<Integer> stack, int val){
        if(stack.isEmpty()|| stack.peek()<=val){
            stack.push(val);
            return;
        }
        int temp = stack.pop();
        insert(stack,val);
        stack.add(temp);
    }
}
