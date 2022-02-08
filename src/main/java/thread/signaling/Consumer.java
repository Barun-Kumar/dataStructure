package thread.signaling;

import java.util.Queue;

public class Consumer implements Runnable{
    Queue q;
    public Consumer(Queue q){
        this.q=q;
    }
    @Override
    public  void run() {
        synchronized (q) {
            while (true) {
                System.out.println("Consumer");
                if (q.isEmpty()) {
                    System.out.println("Q is empty going to wait");
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
                    Integer e = (Integer) q.remove();
                    q.notifyAll();
                    System.out.println(e);

                }
            }
        }

    }
}
