package opps.inheritance.pollymorphism.overriding;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Printer {

    protected Object printer(String name) throws IOException {
        System.out.println(name);
        return name;
    }
}


class StringPrinter extends Printer{

    @Override
    public String printer(String name) throws FileNotFoundException {
        System.out.println(name);
        return name;
    }
}
