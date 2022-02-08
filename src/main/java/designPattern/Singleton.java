package designPattern;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Singleton implements Serializable,Cloneable {
    private static Singleton singleton=null;
    private Singleton() throws Exception {
        if(singleton!=null){
            throw new Exception("Instance is already created, Please use get instance");
        }
        System.out.println("Creating Object...");
    }
    public static Singleton getInstance() throws Exception {
            if (singleton == null) {
                synchronized (Singleton.class) {
                    if(singleton==null) {
                        singleton = new Singleton();
                    }
                }
            }
        return singleton;

    }

    public Object readResolve(){
        return singleton;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
       throw new CloneNotSupportedException("Can not clone singleton object");
    }
}

class Test{
    public static void main(String[] args) throws Exception {
        /*
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        */
        //Let's break it throw Reflection
        /*
        System.out.println("Let's break it throw Reflection");
        Class c= Class.forName("designPattern.Singleton");
        Constructor constructor =  c.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton obj3 = (Singleton) constructor.newInstance();
        System.out.println(obj3.hashCode());
        */

         /*
        System.out.println("Let's break it through Serialization and deSerialization");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));
        oos.writeObject(obj1);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.txt"));
        Singleton obj4 = (Singleton) ois.readObject();
        System.out.println(obj4.hashCode());
        */
        /*
        System.out.println("Let's break it through clone");
        Singleton obj5 = (Singleton) obj1.clone();
        System.out.println(obj5.hashCode());
        */

        System.out.println("Let's break it through thread");
        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<Singleton> obj6=  service.submit(Singleton::getInstance);
        Future<Singleton> obj7=  service.submit(Singleton::getInstance);
        Future<Singleton> obj8=  service.submit(Singleton::getInstance);
        System.out.println(obj6.get().hashCode());
        System.out.println(obj7.get().hashCode());
        System.out.println(obj8.get().hashCode());
        service.shutdown();


    }
}
