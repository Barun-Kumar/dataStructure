package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestTwo {

    //Input : Hello World
    //Output : olleH dlroW

    public static void main(String[] args) {
        String input="Hello World";
        String[]words=input.split(" ");
        System.out.println( Stream.of(words)
                .map(e -> new StringBuffer(e))
                .map(e -> e.reverse())
                .collect(Collectors.joining(" ")));
    }



}
