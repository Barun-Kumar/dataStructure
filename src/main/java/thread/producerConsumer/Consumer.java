package thread.producerConsumer;

import java.util.Queue;

public class Consumer implements Runnable{
    private Queue<Integer> q;
    public Consumer(Queue q){
        this.q=q;
    }
    @Override
    public void run() {
        synchronized(q) {
            while (true) {
                System.out.println(Thread.currentThread());
                if (!q.isEmpty()) {
                    System.out.println("Consuming ...");
                    System.out.println(q.poll());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        System.out.println("Q is empty " + q.isEmpty() + " , Going to wait..");
                        q.notifyAll();
                        q.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
