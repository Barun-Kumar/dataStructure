package tree.bst;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class GenerateBinaryTree {
    public static void main(String[] args) {
        System.out.println(generateBinaryTree());
    }
    private static List<Integer> list;

    public static List<Integer> generateRandomNumber(int low, int high){
        List<Integer> list = new ArrayList<>();
        while(low<high){
            Random random = new Random();
            int r=random.nextInt(high-low)+low;
            list.add(r);
            low++;
        }
        return list;
    }
    public static Node generateBinaryTree() {
        int start=1;
        int end=100;
        list=generateRandomNumber(start,end);
        try {
            return createBinaryTree(list);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static Node generateBinaryTree(int start,int end) throws Exception {
        if(start>end){
            throw new Exception("Start bound should be lesser than end bound");
        }
        list=generateRandomNumber(start,end);
        try {
            return createBinaryTree(list);
        }catch (Exception e){
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public static Node createBinaryTree(List<Integer> list) throws Exception {
        Node root=null;
        if(list==null || list.isEmpty()) {
            throw new Exception("Can not create binary tree with empty list");
        }else{
            System.out.println("Creating tree with list: "+list);
            for(Integer n: list){
                root=insert(root,n);
            }
        }
        BTreePrinter.printNode(root);
        return root;
    }

    public static Node insert(Node root, int number){
        if(root==null){
            root = new Node(number);
            return root;
        }else if(number<=root.data){
            return insert(root.left,number);
        }else{
            return insert(root.right,number);
        }
    }
}
