package com.queue;

public class CircularQueue {
    private final int[] queue;
    private int front=-1;
    private int rear=-1;

    public CircularQueue(int size){
        this.queue = new int[size];
        System.out.println("Queue is initialized with size:"+size);
    }

    public boolean enqueue(int x){
        //Before inserting check the full condition
        int qSize=queue.length;
        if((front==0 && rear==qSize-1) || ((rear+1)%qSize)==front){
            System.out.println("Queue is full");
            return false;
        }else{
            if(front==-1 && rear==-1){
                front=0;
                rear=0;
            }else{
                rear=(rear+1)%qSize;
            }
            queue[rear]=x;
        }
        return true;
    }

    public boolean dequeue(){
        boolean result=false;
        if(front==-1 && rear==-1){
            System.out.println("Queue is empty");
        }else if(front==rear){
            System.out.println(queue[front]);
            front=-1;
            rear=-1;
            result=true;
        }else{
            System.out.println(queue[front]);
            front=(front+1)%queue.length;
            result=true;
        }
        return result;
    }

    public void displayQueue(){
        int f= front;
        int r=rear;

        if((f==-1 && r==-1)){
            System.out.println("Queue is empty");
        }else {
            while (f!=r){
                System.out.print(queue[f]+" ");
                f=(f+1)% queue.length;
            }
            System.out.print( queue[r]+" \n");
            System.out.println("front: "+front+"\n rear: "+rear);
        }
    }
}
