package java8;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {
    //Sum of square of all the odd number
    public static void main1(String[] args) {
        List<Integer> list = List.of(1,2,4,3,6,7,9);
        Predicate<Integer> oddNumber = element -> element%2!=0;
        System.out.println(list.stream()
                .filter(oddNumber)
                .mapToInt(e-> e*e)
               .sum());

    }

    //Longest Even Length Word: Write a function to return the longest even length word in a sentence. Sample input:
    public static void main(String[] args) {
        String s="Be not afraid of greatness, some are born great, some achieve greatness, and some have greatness thrust upon them.";
        //s=s.replaceAll(",", "");
        List<String> words = List.of(s.split(" "));
        System.out.println(words);
        Map<Integer,String> map=words.stream()
                .filter(word -> word.length()%2==0)
                .collect(Collectors.toMap(k -> k.length(), v->v, (f,f1) -> f1));
        System.out.println(map);

        OptionalInt max=map.keySet().stream().mapToInt(e ->e).max();
        System.out.println(max.getAsInt());
        System.out.println(map.get(max.getAsInt()));



    }



}
