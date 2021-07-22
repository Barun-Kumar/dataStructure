package com.searching;

public class Sqrt {
    public static void main(String[] args) {
        int res=mySqrt(99999);
        System.out.println(res);
    }
    public static int mySqrt(int x) {
        if(x==0)
            return 0;
        if(x==1)
            return 1;
        long low = 1, high=x;
        long bps=low;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(mid*mid == x){
                return (int)mid;
            }else if(mid*mid<=x){
                low= mid+1;
                bps=mid;
            }else{
                high=mid-1;
            }
        }
        return (int)bps;
    }
}
