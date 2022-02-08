package thread.producerConsumer;

import java.util.Queue;
import java.util.Random;

public class Producer implements Runnable{
    public Queue<Integer> q;
    public Producer(Queue q){
        this.q=q;
    }

    @Override
    public  void run(){
        synchronized(q) {
            System.out.println(q);
            while (q.size() < 10) {
                System.out.println(Thread.currentThread());

                Random r = new Random();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer n= r.nextInt();
                q.add(n);
                System.out.println("Producing.." +n);
                if (q.size() == 10) {

                        System.out.println("Q is full " + q.size() + " now, Going to wait");
                        q.notify();
                        //q.wait();

                }
            }
        }
        }

}
