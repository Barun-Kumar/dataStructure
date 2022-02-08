package design;

import java.util.Random;

public class Runner {

    public static void main(String[] args) {
        MyBlockingQueue q = new MyBlockingQueue();

    }
}

class Pro implements Runnable{
    MyBlockingQueue q;
    Pro(MyBlockingQueue q){
        this.q=q;
    }
    @Override
    public void run() {
        Random r =new Random();

        while(true){
            System.out.println("Putting no");
            Integer n= r.nextInt();
            try {
                q.put(n);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Con implements Runnable{
    MyBlockingQueue q;
    Con(MyBlockingQueue q){
        this.q=q;
    }
    @Override
    public void run() {
        Random r =new Random();

        while(true){
            System.out.println("Putting no");
            Integer n= r.nextInt();
            try {
                q.put(n);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



