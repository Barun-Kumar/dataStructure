package com.array;

public class MinMax {

    public static void main(String[] args) {
        long[]a={1,4,2,0,-1,5,9};
        Pair p=minMax(a,a.length);
        System.out.println("Min :"+p.min);
        System.out.println("Min :"+p.max);
    }

    public static Pair minMax(long[]a, long n){
        long min=a[0];
        long max=a[0];
        for(int i=0;i<n;i++){
            if(a[i]<min) min = a[i];
            if(a[i]>max) max = a[i];
        }
        return new Pair(min,max);
    }
}
class Pair{
    long min;
    long max;
    Pair(long min,long max){
        this.min=min;
        this.max=max;
    }
}
