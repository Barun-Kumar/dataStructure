package java8.reduce;

import java8.Person;
import java8.PersonFactory;

import java.util.*;
import java.util.stream.Collectors;

public class ReduceOperation {

    public static void main(String[] args) {
        List<Person> people=PersonFactory.createListOfPerson();

        //Sum all people salary
        System.out.println("Sum all people salary");
        int sum= people.stream()
                .map(person -> person.getSalary())
                .reduce(0, (total, salary)-> total+salary);
        System.out.println(sum);

         sum= people.stream()
                .map(person -> person.getSalary())
                .reduce(0, (total, salary)->Integer.sum(total,salary));
        System.out.println(sum);

        sum=people.stream()
                .map(Person::getSalary)
                .reduce(0,Integer::sum);

        System.out.println(sum);

        System.out.println("Find the minimum salary");
        System.out.println(people
                .stream()
                .map(Person::getSalary)
                .reduce(Integer::min)
        );
        System.out.println("Find the maximum salary");
        System.out.println(people
                .stream()
                .map(Person::getSalary)
                .reduce(0,Integer::max)
        );

        // Collect all person name who are greater than 25

        List<String> personsName= people.stream()
                .filter(person -> person.getAge()>30)
                .map(Person::getName)
                .reduce(new ArrayList<String>(),
                        (names,name)->{
                        names.add(name);
                        return names;
                },
                        (names1,names2)->{
                            names1.addAll(names2);
                            return names1;
                        }
                );
        System.out.println(personsName);

        List<String> personsNames= people.stream()
                .filter(person -> person.getAge()>30)
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println(personsNames);

        System.out.println("Collect people names who are older than 30 in upper case");
        System.out.println(people
                .stream()
                .filter(person -> person.getAge()>30)
                .map(name-> name.getName())
                .map(name-> name.toUpperCase())
                .reduce(
                        new ArrayList<String>(),
                        (names,name)-> {
                            names.add(name);
                            return names;
                        },
                        (names1,names2)->{
                            names1.addAll(names2);
                            return names1;
                        }

                )
        );

        System.out.println("Create map with given function where name is the key and age is value with reduce");
        Map<String, Integer> mapOfNameAndAge=
                people.stream()
                        .reduce(
                                new HashMap<String,Integer>(),
                                (map,person)->{
                                    map.put(person.getName(),person.getAge());
                                    return map;

                                },(map1,map2)->{
                                    map1.putAll(map2);
                                    return map1;
                                }
                        );
        System.out.println(mapOfNameAndAge);

        System.out.println("Create map with given function where name is the key and age is value with collect");
        mapOfNameAndAge=
                people.stream()
                        .collect(
                                Collectors.toMap(
                                        (name) ->name.getName(),
                                        (name)->name.getAge(),
                                        (name1,name2) -> name1)
                        );
        System.out.println(mapOfNameAndAge);

    }
}
