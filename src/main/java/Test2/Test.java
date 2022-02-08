package Test2;


import java8.Person;
import java8.PersonFactory;

import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public  static void main(String[] args) throws Exception {
            A a = new A();
            B b = new B();
            B bb = new B();

            List<Person> list = PersonFactory.createListOfPerson();


        //System.out.println(a.hashCode());
        //System.out.println(b.hashCode());

    }

}


class A{
    private static Object obj;
    public A() throws Exception {
        if(obj==null){
            obj = new Object();
            System.out.println("Create object A");
        }else {
            throw new Exception("Exception from A");
        }
    }

}

class B extends A{
private B b;
    private static Object obj;
    public B() throws Exception {
        if(obj==null){
            obj = new Object();
            System.out.println("Create object B");
        }else {
            throw new Exception("Exception from B");
        }
    }
}

