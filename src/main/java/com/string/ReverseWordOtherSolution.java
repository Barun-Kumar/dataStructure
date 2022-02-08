package com.string;

public class ReverseWordOtherSolution {
    public static void main(String[] args) {
        String s="This is varun";
        String[] arr= s.split("\\s+");
        StringBuilder builder = new StringBuilder();
        for(String string: arr){
            builder.append(new StringBuffer(string).reverse().toString()+" ");
        }
        System.out.println(builder.toString().trim());

        //System.out.println(Math.;
    }
}
