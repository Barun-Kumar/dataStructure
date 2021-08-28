package com.searching;

public class FirstBadVersion {
    int badVersion;
    public FirstBadVersion(int badVersion){
        this.badVersion=badVersion;
    }

    public static void main(String[] args) {
        FirstBadVersion obj = new FirstBadVersion(9);

        int r=obj.firstBadVersion(100);
        System.out.println("The first bad version:"+r);
    }
    public int firstBadVersion(int n) {
        if(n==1){
            return n;
        }

        int low=1, high=n;
        int r=0;
        while(low<=high){
            //int mid = (low+high)/2;
            int mid =low+(high-low)/2;

            if(isBadVersion(mid)){
                high=mid-1;
                r=mid;
            }else{
                low=mid+1;
            }
        }
        return r;

    }

    public boolean isBadVersion(int num){
        return num <= this.badVersion;
    }
}
