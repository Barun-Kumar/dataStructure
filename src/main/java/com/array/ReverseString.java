package com.array;

public class ReverseString {
    public static void main(String[] args) {
        String s="VARUN";
       // String r=reverseStringUsingLoop(s);

       String r= reverserUsingRecursion(s);
       System.out.println(r);

    }

    public static String reverserUsingRecursion(String s){
        if(s.length()==1){
            return s;
        }
        String t= s.substring(s.length()-1);
        String r= reverserUsingRecursion(s.substring(0,s.length()-1));
        r= t.concat(r);
        return r;
    }


    public static String reverseStringUsingLoop(String str)
    {
        char[]arr=str.toCharArray();
        int i=0;
        int j=arr.length-1;

        while(i<j){
            char c= arr[i];
            arr[i]=arr[j];
            arr[j]=c;
            i++;
            j--;
        }
        return new String(arr);
    }
}
