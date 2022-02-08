package com.string;

import com.util.NumbersUtil;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString
{

    public static void reverseString(char[] s) {
        NumbersUtil.printArrayInSingleLine(s);
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length;i++){
            stack.push(s[i]);
        }
        int t=0;
        while(!stack.isEmpty()){
            s[t]=stack.pop();
            t++;
        }
        NumbersUtil.printArrayInSingleLine(s);

    }

    public static String reverseUsingRecursion(String s){
        if(s.length()==1){
            return s;
        }
        String l = s.substring(s.length()-1);
        String t= reverseUsingRecursion(s.substring(0,s.length()-1));
        return l=l+t;

    }


    public static void reverseStringT(char[] s){
        System.out.println("Before:  "+s);
        String t=ReverseString.reverseUsingRecursion(new String(s));
        System.out.println(t);
        s=t.toCharArray();
        System.out.println("=========After========");
        System.out.println(s);
    }
    public static void main(String[] args) {
        System.out.println("Enter the String to be reversed");
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        //reverseString(s.toCharArray());
        //String ans =reverseUsingRecursion(s);
        reverseStringT(s.toCharArray());
       // System.out.println(ans);

    }
}
