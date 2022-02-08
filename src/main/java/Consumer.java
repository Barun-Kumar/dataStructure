import java.util.Queue;

public class Consumer implements Runnable{
    private Queue<Integer> q;
    public Consumer(Queue q){
        this.q=q;
    }
    @Override
    public void run() {
        synchronized (q){
            while(true){
                if(!q.isEmpty()){
                    System.out.println(q.poll());
                }else {
                    q.notify();
                    try {
                        q.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
