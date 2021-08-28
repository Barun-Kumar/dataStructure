package com.queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        minHeap.add(1);
        minHeap.add(8);
        minHeap.add(12);
        minHeap.add(2);
        minHeap.add(3);
        System.out.println(minHeap);
        while(!minHeap.isEmpty()){
            System.out.print(minHeap.poll()+" ");
        }
        System.out.println();
        PriorityQueue maxHeap = new PriorityQueue(Collections.reverseOrder());
        maxHeap.add(1);
        maxHeap.add(8);
        maxHeap.add(12);
        maxHeap.add(2);
        maxHeap.add(3);
        System.out.println(maxHeap);
        while (!maxHeap.isEmpty()){
            System.out.print(maxHeap.poll()+" ");
        }

    }
}
