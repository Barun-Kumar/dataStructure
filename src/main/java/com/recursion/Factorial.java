package com.recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter number to find factorial");
        Scanner sc = new Scanner(System.in);
        int input=sc.nextInt();
        int r=fact(input);
        System.out.println("Factorial of "+r+" :"+r);

    }
    public static int fact(int n){
        if (n==1)
            return 1;
        int r= n*fact(n-1);
        return r;
    }
}
