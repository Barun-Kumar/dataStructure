package java8;

import java.util.List;
import java.util.stream.Collectors;

public class TestStream {

    public static void main(String[] args) {
        List<Person> people = PersonFactory.createListOfPerson();
        System.out.println(people);
        for (Person person : people) {
            System.out.println(person);
        }

        List<Person> l = people.stream()
                .filter(p-> p.getSalary()>1000)
                .map(p-> change(p))
                .collect(Collectors.toList());

        System.out.println("==================================================");
        System.out.println(l);
        for (Person person : people) {
            System.out.println(person);
        }


        System.out.println("people hashcode");
        System.out.println(people.toString());
        System.out.println("l hashcode");
        System.out.println(l.toString());
        if(people ==l){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }


    public static Person change(Person p){
        p.setSalary(0);
        return p;
    }
}
