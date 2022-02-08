package tree.bst;

import thread.producerConsumer.Consumer;
import thread.producerConsumer.Producer;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerAndConsumerTest {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Thread producer = new Thread(new Producer(q));
        Thread consumer = new Thread(new Consumer(q));
        producer.start();
        consumer.start();
    }
}
