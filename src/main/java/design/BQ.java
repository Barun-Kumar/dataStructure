package design;

import com.array.List;

import java.util.Random;

public class BQ {

    Node front;
    Node rear;
    int size=0;
    int initialSize=10;
    public BQ(int initialSize){
        this.initialSize=initialSize;
    }
    public boolean isEmpty(){
        return size!=0;
    }

    public synchronized void put(Integer data) throws InterruptedException {
        if(size==this.initialSize){
            System.out.println("Q is full, can not put element in it");
            this.wait();
        }else {
            Node node = new Node(data);
            if(front==null){
                front=node;
            }else {
                rear.setNext(node);
            }
            rear=node;
            size++;
            this.notifyAll();
        }
    }

    public synchronized int take() throws InterruptedException {
        if (size==0){
            this.wait();
        }
            int data= front.getData();
            front=front.getNext();
            size--;
            this.notifyAll();
            return data;
    }

}

class LinkedNode{
    private Integer data;
    private LinkedNode next;

    LinkedNode(Integer data){
        this.data=data;
    }
}

class TestMain{
    public static void main(String[] args) {
        BQ q = new BQ(10);

        P p =new P(q);
        C c = new C(q);
        Thread p1 = new Thread(p);
        Thread c1 = new Thread(c);
        p1.start();
        c1.start();


    }
}
class P implements Runnable {
    BQ q;
    public P(BQ q){
        this.q=q;
    }
    @Override
    public void run() {
        Random r = new Random();
        while(true){
            try {
                Thread.sleep(1000);
                Integer n= r.nextInt();
                System.out.println("Producing.."+n);
                q.put(n);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class C implements Runnable{
    BQ q;
    public C(BQ q){
        this.q=q;
    }
    @Override
    public void run() {
       while(true){
           try {
               Thread.sleep(100);
               int n = q.take();
               System.out.println("Consumed :"+n);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

       }
    }
}






