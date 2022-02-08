package collection;

import java8.Person;
import java8.PersonFactory;

import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Person> students= PersonFactory.createListOfPerson();

        System.out.println(students.stream()
                .collect(Collectors.groupingBy(Person::getAge)));
    }


}
