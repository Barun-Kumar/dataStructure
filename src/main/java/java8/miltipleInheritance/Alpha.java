package java8.miltipleInheritance;

public interface Alpha {
    public default void print(){
        System.out.println("Hello from alpha default");
    }
    public void hello();
}
