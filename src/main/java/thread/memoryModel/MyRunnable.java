package thread.memoryModel;

public class MyRunnable implements Runnable{
    private int count;

    public void run(){
     //   synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " -> " + incrementCount());
            }
       // }
    }

    public int incrementCount(){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this.count+=1;
    }
}
