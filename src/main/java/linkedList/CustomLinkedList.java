package linkedList;

public class CustomLinkedList {


    public static int size(Node head) throws Exception {
        if(head==null){
            throw new Exception("List is null");
        }
        int count=0;
        while(head!=null){
            head=head.getNext();
            count++;
        }
        System.out.println("size of list:"+count);
        return count;
    }
    public static Node addAtMiddle(Node h,int data) throws Exception {
        Node head =h;
        Node node = new Node(data);
        int s = size(head);
        int mid =s/2;
        int start=1;
        while(start<mid){
            head =head.getNext();
            start++;
        }

        node.setNext(head.getNext());
        head.setNext(node);
        return h;
    }

    public static void main(String[] args) throws Exception {
        Node one = new Node(1);
        Node two =new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);

        four.setNext(five);
        three.setNext(four);
        two.setNext(three);
        one.setNext(two);
        System.out.println(one);

        Node t=addAtMiddle(one,10);
        System.out.println(t);
        size(one);

    }
}
