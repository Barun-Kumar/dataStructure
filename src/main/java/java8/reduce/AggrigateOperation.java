package java8.reduce;

import java8.Person;
import java8.PersonFactory;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AggrigateOperation {
    public static void main(String[] args) {
        List<Person> people= PersonFactory.createListOfPerson();
        System.out.println("Find the maximum salary person");
        System.out.println(people.stream().collect(Collectors.maxBy(Comparator.comparing(person -> person.getSalary()))));
    }
}
