package java8.functionalInterface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionTest {

    public static void main(String[] args) {
        HashMap<Integer,String> numberToWord = new HashMap<>();
        numberToWord.put(1,"One");
        numberToWord.put(2,"Two");
        numberToWord.put(3,"Three");
        numberToWord.put(4,"Four");
        numberToWord.put(5,"Five");

        Function<Integer,String> conversion =(i)-> numberToWord.get(i);
        Function<String,String> toLowerCase= String::toLowerCase;


        conversion=conversion.andThen(toLowerCase);
        System.out.println(conversion.apply(5));
        conversion=toLowerCase.compose(conversion);
        System.out.println(conversion.apply(5));
        List<Integer> list = Arrays.asList(1,2,3,4);
        List<String> res=list.stream()
                .map(conversion.andThen(toLowerCase))
                .collect(Collectors.toList());
        System.out.println(res);

        List<String> res1=list.stream()
                .map(toLowerCase.compose(conversion))
                .collect(Collectors.toList());
        System.out.println(res1);


        Map<Integer,String> map = list.stream()
                .collect(Collectors.toMap(integer -> integer,conversion));
        System.out.println(map);


    }
}
