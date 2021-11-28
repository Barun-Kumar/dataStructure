package java8;

public class ThreadUsingJava8 {

    public static void main(String[] args) {

        //Before
        Runnable target = new Runnable() {
            @Override
            public void run() {
                int n=1;
                while (n<=10){
                    System.out.println(n+" java 7");
                    n++;
                }
            }
        };
        Thread t = new Thread(target);
        t.start();

        //after
        Runnable r = () ->{
            int n=1;
            while (n<=10){
                System.out.println(n+" java 8");
                n++;
            }
        };
        Thread t1 = new Thread(r);
        t1.start();

    }
}
