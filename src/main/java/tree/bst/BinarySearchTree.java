package tree.bst;

import com.util.NumbersUtil;

import java.util.List;

public class BinarySearchTree {
    public static BSTNode add(BSTNode root, int data) {
        if (root == null) {
            root = new BSTNode(data);
        } else if (data <= root.data) {
            root.left = add(root.left, data);
        } else {
            root.right = add(root.right, data);
        }
        return root;
    }

    public static boolean search(BSTNode root, int data) {
        if (root == null) {
            System.out.println("Tree is empty or tree is exhausted and element was not found");
            return false;
        } else if (data == root.data) {
            System.out.println(data + " is found");
            return true;
        } else if (data < root.data) {
            return search(root.left, data);
        } else {
            return search(root.right, data);
        }
    }

    public static int findMinRecursion(BSTNode root) throws Exception {
        if (root == null) {
            throw new Exception("Tree is empty can not find min");
        }else if(root.left==null){
            return root.data;
        }
        return findMinRecursion(root.left);

    }
    private static int findMaxRecursion(BSTNode root) throws Exception {
        if(root==null){
            throw new Exception("Tree is empty can not find max");
        }else if(root.right==null){
            return root.data;
        } return findMaxRecursion(root.right);

    }
    public static int findMin(BSTNode root) throws Exception {
        if (root == null) {
            throw new Exception("Tree is empty can not find min");
        }
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }
    private static int findMax(BSTNode root) throws Exception {
        if(root==null){
            throw new Exception("Tree is empty can not find max");
        }
        while(root.right!=null){
            root=root.right;
        }
        return root.data;
    }

    private static int findHeight(BSTNode root) {
        if(root==null){
            return -1;
        }
        else{
            return Math.max(findHeight(root.left),findHeight(root.right))+1;
        }
    }

    public static void main(String[] args) throws Exception {
        BSTNode rootTemp = null;
        List<Integer> nums = NumbersUtil.generateRandomList(1, 100, 20);
        for(Integer n:nums){
            rootTemp = add(rootTemp,n);
        }

        BTreePrinter.printNode(rootTemp);
        System.out.println("Height of tree is: "+findHeight(rootTemp));
        search(rootTemp, -100);
        search(rootTemp, -1000);
        System.out.println("Min is :" + findMin(rootTemp));
        System.out.println("Max is :" + findMax(rootTemp));
        System.out.println("Min using recursion :" + findMinRecursion(rootTemp));
        System.out.println("Max using recursion :" + findMaxRecursion(rootTemp));

    }
}
