package com.queue;

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularQueue q = new CircularQueue(5);
        while(true){
            System.out.println("Chose option e for ENQ and d for DQ");
            char input =sc.next().charAt(0);
            if(input=='e'){
                System.out.println("Enter element to enqueue");
                int x=sc.nextInt();
                q.enqueue(x);
            }else if(input=='d') {
                System.out.println("You have chosen to dequeue");
                q.dequeue();
            }else if(input=='q'){
                break;
            }
            else{
                q.displayQueue();
            }
        }






    }
}
