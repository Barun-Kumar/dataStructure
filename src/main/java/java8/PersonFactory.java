package java8;

import java.util.Arrays;
import java.util.List;

public class PersonFactory {

    public static List<Person> createListOfPerson(){
       return Arrays.asList(
                new Person(1,"Varun",32,"varun@gmail.com",110000),
                new Person(2,"Kumar",23,"kumar@gmail.com",20000),
                new Person(3,"Aarun",36,"arun@gmail.com",30000),
                new Person(4,"Rahul",30,"rahul@gmail.com",15000),
               new Person(20,"Rahul",30,"rahul@gmail.com",15000),
                new Person(5,"Lav",40,"lav@gmail.com",20000),
               new Person(21,"Lav",40,"lav@gmail.com",20000),
                new Person(6,"Sonu",35,"sonu@gmail.com",30000),
                new Person(7,"Deeksha",30,"deeksha@gmail.com",70000),
                new Person(8,"Golu",24,"golu@gmail.com",80000),
                new Person(9,"Hritik",15,"hritik@gmail.com",90000),
                new Person(10,"Anshika",7,"anshika@gmail.com",20000),
                new Person(11,"Anshika",7,"anshika@gmail.com",20000),
                new Person(12,"Anshika",7,"anshika@gmail.com",20000),
                new Person(13,"Anshika",7,"anshika@gmail.com",20000)
        );
    }
}
