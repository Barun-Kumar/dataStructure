package java8.sortUserObject;

import java8.Person;
import java8.PersonFactory;
import utils.ListUtil;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingTest {

    public static void main(String[] args) {
        List<Person> people=PersonFactory.createListOfPerson();
        //System.out.println(people);

        //Lest sort by name

        Comparator<Person> sortByName = (p1,p2)->{
            if(p1.getName().compareTo(p2.getName())==0){
                if(p1.getSalary().compareTo(p2.getSalary())==0){
                    return p1.getAge().compareTo(p2.getAge());
                }else{
                    return p1.getSalary().compareTo(p2.getSalary());
                }

            }else {
                return p1.getName().compareTo(p2.getName());
            }
        };
        Collections.sort(people,sortByName);
        ListUtil.getInstance().printList(people);

    }
}
