package com.dynamicProgramming;

import java.util.Arrays;

public class KnapSackBottomUp {
    public static void main(String[] args) {
        int[] weight={2,5,7,3,4};
        int[] values={5,7,10,4,6};
        int W=11;
        int n=weight.length;
        int totalProfit=knapSack(weight,values,W,n);
        System.out.println();


    }

    public static int knapSack(int[] weight, int[] values, int W, int n){
        int[][] t = new int[n+1][W+1];
      //  initializeArray(t);
        printArray(t);
        System.out.println("\n");
        for(int i=1;i<t.length;i++) {
            for (int j = 1; j < t[0].length; j++) {
                if (weight[i - 1] <= j) {
                    t[i][j] = Math.max(values[i - 1] + t[i - 1][j - weight[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        printArray(t);

        return t[n][W];
    }

    public static void initializeArray(int[][] t){
        for(int i=0;i<t.length;i++){
            for (int j=0;j<t[0].length;j++){
                if(i==0|| j==0){
                    t[i][j]=0;
                }
            }
        }
    }

    public static void printArray(int[][] t){
        for(int i=0;i<t.length;i++){
            for (int j=0;j<t[0].length;j++){
                if(t[i][j]>9){
                    System.out.print(t[i][j]+"  ");
                }else{
                    System.out.print(t[i][j]+"   ");
                }

            }
            System.out.println();
        }
    }
}
