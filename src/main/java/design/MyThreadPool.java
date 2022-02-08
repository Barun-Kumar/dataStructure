package design;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MyThreadPool {

    private final int threadCount;
    private final BlockingQueue<Runnable> queue;
    private final Thread[] workers;

    public MyThreadPool(int threadCount){
        this.threadCount=threadCount;
        queue= new LinkedBlockingQueue<>();
        workers = new MyWorkerThread[threadCount];
        for(int i=0;i<threadCount;i++){
            workers[i]= new MyWorkerThread("Pool Worker thread :"+i);
            workers[i].start();
        }

    }

    public void execute(Runnable r){
        synchronized (queue) {
            queue.add(r);
            queue.notifyAll();
        }
    }

    private class MyWorkerThread extends Thread{
        public MyWorkerThread(String s) {
            super(s);
        }
        public void run(){
            Runnable r;
            synchronized (queue) {
                while (queue.isEmpty()) {
                   // if (queue.isEmpty()) {
                        System.out.println("No task to process");
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    r= queue.poll();
                    if(r!=null) {
                        r.run();
                       // queue.notifyAll();
                    }
                }

           // }

        }

    }
}

class Main{
    public static void main(String[] args) throws InterruptedException {
        MyThreadPool pool = new MyThreadPool(5);
        Task t = new Task();
        Task t1 = new Task();
        Task t2 = new Task();
        Task t3 = new Task();

        pool.execute(t);
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);

        Thread.sleep(10000);
        Task t4 = new Task();
        pool.execute(t4);


    }
}

class Task implements Runnable{

    @Override
    public void run() {
        int i=0;
        while (i<10){
            System.out.println(Thread.currentThread()+" - >"+i);

            i++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


