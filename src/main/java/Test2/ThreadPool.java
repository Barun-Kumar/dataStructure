package Test2;

import java.util.LinkedList;
import java.util.Queue;

public class ThreadPool {

    private Queue<Runnable> queue;
    private Thread[] workers =null;
    private int noThread;
    private volatile boolean isShutDown=false;

    public ThreadPool(int noThread){
        this.noThread=noThread;
        queue = new LinkedList<>();
        workers = new WorkerThread[noThread];
        for(int i=0;i<noThread;i++){
            workers[i]=new WorkerThread("Pool of thread :"+i);
            workers[i].start();
        }

    }

    public void addTask(Runnable task) throws Exception {
        if(!isShutDown) {
            queue.add(task);
        }else{
            throw new Exception("No tasks are allowed");
        }
    }

    public boolean shutDown(){
       // for()
        return true;
    }

    public boolean shutDownNow(){
       // Thread.currentThread().
        return true;
    }


    private class WorkerThread extends Thread{
        public volatile boolean shutDown=false;
        public WorkerThread(String name){
            super(name);
        }
        @Override
        public void run() {
            shutDown=true;
           Runnable runnable;
           while (true){

           }

        }
    }

}
