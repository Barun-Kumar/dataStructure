package thread.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerTest {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Thread producer = new Thread(new Producer(q),"Producer");
        Thread consumer = new Thread(new Consumer(q),"Consumer");
        producer.start();
        consumer.start();
    }
}
