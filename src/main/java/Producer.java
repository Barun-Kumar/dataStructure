import java.util.Queue;
import java.util.Random;

public class Producer implements Runnable {
    Queue<Integer> q;

    public Producer(Queue q){
        this.q=q;
    }
    @Override
    public void run() {
        synchronized (q) {
            while (true) {
                if (q.size() <= 10) {
                    Random r = new Random();
                    Integer res = r.nextInt();
                    q.add(res);
                } else {
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
