package design;

public class MyBlockingQueue {

    private Node front;
    private Node rear;
    private int size=0;

    public boolean isEmpty(){
        return this.size==0;
    }

    public synchronized void put(int data) throws InterruptedException {
        if(size==10){
            this.wait();
        }else{
            Node node = new Node(data);
            if(front==null){
                front=node;
            }else{
                rear.setNext(node);
            }
            rear=node;
            size++;
            this.notifyAll();
        }

    }

    public synchronized int take() throws InterruptedException {
        System.out.println("Taking element");
        if(size==0){
            System.out.println("Size is empty, Going to wait");
            this.wait();
        }
            int data= front.getData();
            front= front.getNext();
            size--;
            return data;
    }
}
