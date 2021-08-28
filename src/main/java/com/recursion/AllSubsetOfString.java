package com.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AllSubsetOfString {

    public static void main(String[] args) {
        String in="abcd";
        String out ="";
         solve(in,out);

        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(1);
        l.add(7);
        l.add(9);


        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);


    }

    private static void solve(String in, String out) {
        if(in.length()==0){
            System.out.println(out);
            return;
        }

        String out1=out;
        String out2 =out;
        out2=out.concat(in.substring(0,1));
        in=in.substring(1);
        solve(in,out1);
        solve(in,out2);

    }
}
