package test;

import java.util.Objects;

public class TestM {
    public static void main(String[] args) {
        Emp e = new Emp("varun");
        Emp e1 = new Emp("varun");

        StringBuffer s = new StringBuffer("varun");
        StringBuffer s1 =new StringBuffer("varun");



        System.out.println(e.hashCode());
        System.out.println(e1.hashCode());
    }

}

class Emp{
    private String name;

    public Emp(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return Objects.equals(name, emp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
