package com.queue;

public class QueueMain {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        System.out.println(q.enqueue(5));
        System.out.println(q.enqueue(10));
        System.out.println(q.enqueue(15));
        System.out.println(q.enqueue(25));
        System.out.println(q.enqueue(35));
        System.out.println(q.enqueue(45));



        q.displayQueue();


    }
}
