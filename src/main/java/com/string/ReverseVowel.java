package com.string;

import java.util.Arrays;
import java.util.List;

public class ReverseVowel {
    public static String reverseVowels(String t) {
        if(t.length()==1){
            return t;
        }
        char[] s= t.toCharArray();
        List<Character> vowels = Arrays.asList('a','e','i','o','u','A','E','I','O','U');

        int start=0;
        int end = s.length-1;
        while(start<end){
            if(!vowels.contains(s[start])){
                start++;
            }
            if(!vowels.contains(s[end])){
                end--;
            }
            if(vowels.contains(s[start]) && vowels.contains(s[end])){
                char temp = s[start];
                s[start]=s[end];
                s[end]=temp;
                start++;
                end--;
            }
        }
        return new String(s);
    }


    public static void main(String[] args) {
        String s="hello";
        String ans=reverseVowels(s);
        System.out.println(ans);

    }
}
