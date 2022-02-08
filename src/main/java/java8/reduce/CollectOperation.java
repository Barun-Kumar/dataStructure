package java8.reduce;

import java8.Person;
import java8.PersonFactory;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectOperation {

    public static void main(String[] args) {

        List<Person> people= PersonFactory.createListOfPerson();
        System.out.println("Get names of people in upper case whose age are greater than 30");
        System.out.println(
                people.stream()
                        .filter(person -> person.getAge()>30)
                        .map(person -> person.getName())
                        //.distinct()
                        .map(String::toUpperCase)
                        .collect(Collectors.joining(","))
        );

        System.out.println("Given a collection collect people with odd age and even age");
        Map<Boolean, List<Person>> map=people.stream()
                .collect(Collectors.partitioningBy(person -> person.getAge()%2==0));
        System.out.println(map);

        System.out.println("Given a collection collect people by their name");
        Map<String, List<Person>> mapByName= people.stream()
                .collect(Collectors.groupingBy(person -> person.getName()));
        System.out.println(mapByName);

        System.out.println("Given a collection collect people by their name and count occurences");
        Map<String, Long> mapByNameCount= people.stream()
                .collect(Collectors.groupingBy(person -> person.getName(),Collectors.counting()));
        System.out.println(mapByNameCount);

        System.out.println("Given a collection collect people by their name and lsit of ages");
        Map<String,List<Integer>> ageByName = people.stream()
                        .collect(Collectors.groupingBy(person-> person.getName(),Collectors.mapping(person -> person.getAge(), Collectors.toList())));
        System.out.println(ageByName);

        System.out.println(people.stream()
                .collect(Collectors.groupingBy(person-> person.getName())));

        Map<String,Long> m= people.stream().collect(Collectors.groupingBy(person-> person.getName(),Collectors.counting()));
        System.out.println(map);
        Map<String,String> a=people.stream().collect(Collectors.groupingBy(person -> person.getName(),Collectors.mapping(person -> person.getName(),Collectors.joining(","))));
        System.out.println(a);

        Map<String,Integer> res = people.stream().collect((Collectors.groupingBy(person-> person.getName(),Collectors.collectingAndThen(Collectors.counting(),Long::intValue))));
        System.out.println(res);





    }
}
