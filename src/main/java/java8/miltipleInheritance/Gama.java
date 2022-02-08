package java8.miltipleInheritance;

public interface Gama extends Alpha{
    public default void show(){
        System.out.println("Show from Gama");
    }
}
