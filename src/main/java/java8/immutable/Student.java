package java8.immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final public class Student {
     private final String name;
     private final Integer roll;
     private final List<String> hobbies;


    public Student(String name, Integer roll, ArrayList<String> hobbies) {
        this.name = name;
        this.roll = roll;
        List<String> tempHobbies = new ArrayList<>();
        for(String h:hobbies){
            tempHobbies.add(h);
        }
        this.hobbies = tempHobbies;
    }

    public String getName() {
        return name;
    }


    public Integer getRoll() {
        return roll;
    }

    public List<String> getHobbies() {
        List<String> tempHobbies = new ArrayList<>();
        for(String s:hobbies){
            tempHobbies.add(s);
        }
        return tempHobbies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", hobbies=" + hobbies +

                '}';
    }
}


class Child{

    public Child() {
        super();
    }

    public static void main(String[] args) {
        ArrayList hobbies = new ArrayList();
        hobbies.add("Swimming");
        hobbies.add("Running");
        Student s= new Student("Varun",1,hobbies);
        hobbies.add("R");

        System.out.println(s);

    }
}
