package thread.volatileTest;

public class VolatileTest implements Runnable{
  public volatile  int count;
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            //Thread.currentThread()
            count++;
        }
        System.out.println(count);
    }


    public static void main(String[] args) {
        Runnable r = new VolatileTest();

        Thread t = new Thread(r);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t.start();
        t1.start();
        t2.start();
    }
}
