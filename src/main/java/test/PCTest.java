package test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class PCTest {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Runnable pr = new MyProducer(queue);
        Runnable c1 = new MyConsumer(queue);
       // Runnable c2 = new MyConsumer(queue);

        Thread p = new Thread(pr);
        Thread c= new Thread(c1);
        Thread t= new Thread(c1);
        p.start();
        c.start();
        t.start();

    }
}


class MyProducer implements Runnable{
    Queue<Integer> queue;
    public MyProducer(Queue queue){
        this.queue=queue;
    }
    @Override
    public void run() {

            while (true) {
                synchronized (queue) {
                if (queue.size() == 10) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Random r = new Random();
                Integer num = r.nextInt();
                System.out.println("Producing :" + num);
                queue.add(num);
                queue.notifyAll();
            }
        }
    }
}

class MyConsumer implements Runnable{

    Queue queue;
    public MyConsumer(Queue queue){
        this.queue=queue;
    }
    @Override
    public  void run() {

            while (true) {
                synchronized (queue) {
                if (queue.isEmpty()) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Integer num = (Integer) queue.poll();
                System.out.println(Thread.currentThread().getName()+" Consumed :" + num);
                queue.notifyAll();
            }
        }
    }
}