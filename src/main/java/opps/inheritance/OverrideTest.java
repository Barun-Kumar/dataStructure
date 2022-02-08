package opps.inheritance;

public class OverrideTest {

    public String name;
    public Object print(String name,Integer num){
        System.out.println("From parent "+name +"Number :"+num);
        return null;
    }

    public static Object getName(){
        System.out.println("From parent static");
        return "parent";
    }
}

class Sublass extends OverrideTest{

    @Override
    public Integer print(String name,Integer num){
        System.out.println("From child "+name+" Num :"+num);
        return null;
    }

    public static String getName(){
        System.out.println("From child static");
        return "child";
    }

    public static void main(String[] args) {
        OverrideTest test = new Sublass();
        test.print("Xyz",7);

        OverrideTest.getName();
    }
}
