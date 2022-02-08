package map;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortMapByValue {
    private String name;
    int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SortMapByValue that = (SortMapByValue) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("jasdjfal","alksdfdja","kasdf","def","a","ab","abc","abcd","abcde");
        System.out.println(list);
        Map<Integer,String> map = list.stream()
                .collect(Collectors.toMap(name->name.length(), Function.identity(),(oldValue,newValue) ->oldValue));
        System.out.println(map);

        Map<Integer,String> m=map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(f,s)->s, LinkedHashMap::new));
        System.out.println(m);

        Map<Integer,String> rev=map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(f,s)->s, LinkedHashMap::new));
        System.out.println(rev);

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);



    }
}
