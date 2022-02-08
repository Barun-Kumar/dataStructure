package java8.miltipleInheritance;

public class Delta implements Beta,Gama{
    @Override
    public void hello() {
        System.out.println("Hello from Delta");
    }

    @Override
    public void show() {
        System.out.println("Show from Delta");
    }
}
