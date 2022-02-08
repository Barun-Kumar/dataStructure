package test;

import utils.ArrayUtils;

import java.util.Arrays;
import java.util.List;

public class FindSumOfSquareOdd {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5,7,4);
        System.out.println(list.stream()
                .filter(n -> n%2!=0)
                .map(n -> n*n)
                .mapToInt(n -> Integer.valueOf(n))
                .sum());

    }



}
