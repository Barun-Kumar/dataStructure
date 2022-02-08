package java8.miltipleInheritance;

public interface Beta extends Alpha {
    public default void show(){
        System.out.println("Show from Beta");
    }
}
