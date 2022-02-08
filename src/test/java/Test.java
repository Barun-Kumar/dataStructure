import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(10);
        //l.add(7,10);
        System.out.println(l);
    }

    public static class Printer implements Runnable{
        static int count=1;
        @Override
        public synchronized void run() {
           // synchronized (this) {

                while (count <= 10) {
                    System.out.println(count);
                    count++;
                }
           // }
        }
    }
}
