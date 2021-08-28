package com.recursion;

import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Varun";

        List<Character> list = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        System.out.println(list);
        reverse(list);
        System.out.println(list);

    }

    public static void reverse(List<Character> list) {
        if (list.size() == 1) {
            return;
        }
        Character t = list.remove(list.size() - 1);
        reverse(list);
        list.add(0,t);
    }
}
