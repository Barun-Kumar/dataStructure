
/*
Find the first N words with the highest frequency in an array of strings.

The result needs to be sorted by frequency.

For example:

An array of String:

Inputs:

{"Believe", "for", "good", "Believe", "for", "trust", "Believe", "forsake", "Believe",

"Believe", "in", "you", "youtube", "Google", "for", "learning", "virtual", "data"};

and the first 2 words with the highest frequency.
 */

import java8.Person;
import java8.PersonFactory;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {

    public static void main(String[] args) throws InterruptedException {
            List<Person> people=PersonFactory.createListOfPerson();

        System.out.println(people.stream()
                .collect(Collectors.maxBy((person1,person2)-> person1.getSalary().compareTo(person2.getSalary()))));

        Iterator<Person> itr =people.iterator();
        ListIterator<Person> litr = people.listIterator();

//        while(itr.hasNext()){
//            people.remove(2);
//        }

        while(litr.hasNext()){
            people.remove(2);
        }



    }


}
