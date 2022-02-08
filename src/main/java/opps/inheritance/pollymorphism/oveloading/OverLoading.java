package opps.inheritance.pollymorphism.oveloading;

import java.io.IOException;
import java.sql.SQLDataException;

public class OverLoading {

    public void sum(Integer f, Integer s) throws IOException {
        System.out.println(f+s);
    }
    private int sum(Integer f, long s) throws Exception{
        System.out.println(f+s);
        return (int) (f+s);
    }
    private int sum(long s,Integer f) {
        System.out.println(f+s);
        return (int) (f+s);
    }
}
