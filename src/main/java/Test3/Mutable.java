package Test3;

import java8.immutable.Student;

import java.util.ArrayList;
import java.util.List;

final public class Mutable {
    final private int x;
    final private List<Student> students;
    public Mutable(int x, List<Student> temp){
        this.x=x;
        students = new ArrayList<>();
        for(Student s: temp){
            students.add(s);
        }
    }

    public int getX() {
        return x;
    }

    public List<Student> getList() {
        List<Student> temp = new ArrayList<>();
        for(Student s: this.students){
            temp.add(s);
        }
        return temp;
    }
}
