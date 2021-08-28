package com.dynamicProgramming;

import java.util.Arrays;

public class KnapSack {

    static int[][] t= new int[5+1][15+1];
    static {
        for(int[] row : t){
            Arrays.fill(row,-1);
        }

        for (int i=0; i<t.length; i++){
            for (int j=0; j<t[1].length; j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] weight={2,3,4,7,8};
        int[] values={1,2,6,2,5};
        int W=15;
        int n=weight.length;
        int totalProfit=knapSack(weight,values,W,n);
        System.out.println();
        System.out.println();
        for (int i=0; i<t.length; i++){
            for (int j=0; j<t[1].length; j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(totalProfit);
    }

    public static int knapSack(int[] weight, int[] values, int W, int n){
        if(n==0 || W ==0)
            return 0;

        if(weight[n-1]<=W){
            if(t[n][W]!=-1){
                return t[n][W];
            }

            return t[n][W] = Math.max(values[n-1] +knapSack(weight,values,W-weight[n-1], n-1), knapSack(weight,values,W,n-1));
        }else {
            return t[n][W]=knapSack(weight,values,W,n-1);
        }

    }
}
