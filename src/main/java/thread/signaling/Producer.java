package thread.signaling;

import java.util.Queue;
import java.util.Random;

public class Producer implements Runnable{

    Queue q;
    public Producer(Queue q){
        this.q=q;
    }
    @Override
    public  void run() {
        synchronized (q) {
            Random r = new Random();

            while (true) {
                System.out.println("Producer");
                if (q.size() == 10) {
                    System.out.println("Q is full,Going to wait");
                    try {
                        q.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Integer n= r.nextInt();
                    System.out.println("Generating -"+n);
                    q.add(n);
                    q.notifyAll();
                }
            }
        }
    }


}
