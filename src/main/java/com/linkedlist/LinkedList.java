package com.linkedlist;

public class LinkedList {
    Node head=null;

    public Node add(int value){
        if(head==null){
            Node temp = new Node(value);
            head=temp;
        }else{
            Node h=head;
            while(h.next!=null){
                h=h.next;
            }
            Node temp = new Node(value);
            h.next=temp;
        }
        return head;
    }

    public boolean remove(int value){
        boolean deleted=false;
        if(head==null){
            System.out.println("The link list is empty");
        }else{
            Node current =head;
            Node previous=head;
             while(current.next!=null || current.data==value){
                if(value==current.data){
                    previous.next=current.next;
                    deleted=true;
                    break;
                }else{
                    previous=current;
                    current=current.next;
                }
            }
        }
        return deleted;
    }

    public void print(){
        Node h =head;
        if(h==null){
            System.out.println("Linked List is empty");
        }else {
            while(h.next!=null){
                System.out.println(h.data);
                h=h.next;
            }
            System.out.println(h.data);
        }
    }
}
