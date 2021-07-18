package com.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
       /* for(int i=1;i<=10;i++){
            l.add(i);
        }*/

      Node head=  l.add(1);
        System.out.println(head.data);
        head=head.next;
        System.out.println(head);





    }
}
