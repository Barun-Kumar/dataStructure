package java8.optional;

import java8.Person;
import java8.PersonFactory;

import javax.swing.*;
import javax.swing.text.html.Option;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindSalary {

    public static void main(String[] args) {
       List<Person> people =PersonFactory.createListOfPerson();
        people.stream().sorted(Comparator.comparingInt(Person::getSalary)).forEach(p -> System.out.println(p.getSalary()));
       Optional<Person> max=findMaxSalary(people);
       System.out.println("Max Salary is :"+max.get());

        Optional<Person> secondHighestSalary=findSecondHighestSalary(people);
        System.out.println("Second highest Salary is :"+secondHighestSalary.get());

        Optional<Person> min=findMinSalary(people);
        System.out.println("Min Salary is :"+min.get());
        Optional<Person> secondLeastSalary=findSecondLeastSalary(people);
        System.out.println("Second least Salary is :"+secondLeastSalary.get());

        System.out.println(findDistinctSalary(people));

    }

    public static Optional findMaxSalary(List<Person> people){
        return people.stream().max(Comparator.comparingInt(Person::getSalary));
        //return people.stream().collect(Collectors.maxBy(Comparator.comparingInt(Person::getSalary)));
    }

    public static Optional findMinSalary(List<Person> people){
        return people.stream().min(Comparator.comparingInt(Person::getSalary));
    }

    public static Optional findSecondHighestSalary(List<Person> people){
       return people.stream()
               .sorted(Comparator.comparingInt(Person::getSalary).reversed())
               .skip(1)
               .findFirst();
    }

    public static Optional findSecondLeastSalary(List<Person> people){
        return people.stream()
                .sorted(Comparator.comparingInt(Person::getSalary))
                .distinct()
                .skip(1)
                .findFirst();
    }

    public static List<Integer> findDistinctSalary(List<Person> people){
        return people.stream()
                .map(Person::getSalary)
                .distinct()
                .collect(Collectors.toList());
    }




}
