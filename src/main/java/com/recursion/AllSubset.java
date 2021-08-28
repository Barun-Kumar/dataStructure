package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class AllSubset {

    public static void main(String[] args) {
        String in="abcd";
        String out ="";
        List<String> allSubSet =new ArrayList<>();
        solve(in,out,allSubSet);
        System.out.println(allSubSet.size());
        System.out.println(allSubSet);
        //allSubSet.stream().sorted().forEach(n-> System.out.print(n+" "));
    }

    public static List<String> solve(String in, String out, List<String> allSubSet){
        if(in.length()==0){
            allSubSet.add(out);
            return allSubSet;
        }

        String output1 =out;
        String output2 =out;
        output2=output2.concat(in.substring(0,1));
        in=in.substring(1);
        solve(in,output1,allSubSet);
        solve(in, output2, allSubSet);
        return allSubSet;
    }
    }

