package tree.bst;

import com.util.NumbersUtil;

import java.util.*;

public class BinarySearchTree {
    public static Node add(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data <= root.data) {
            root.left = add(root.left, data);
        } else {
            root.right = add(root.right, data);
        }
        return root;
    }

    public static boolean search(Node root, int data) {
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

    public static int findMinRecursion(Node root) throws Exception {
        if (root == null) {
            throw new Exception("Tree is empty can not find min");
        } else if (root.left == null) {
            return root.data;
        }
        return findMinRecursion(root.left);

    }

    private static int findMaxRecursion(Node root) throws Exception {
        if (root == null) {
            throw new Exception("Tree is empty can not find max");
        } else if (root.right == null) {
            return root.data;
        }
        return findMaxRecursion(root.right);

    }

    public static int findMin(Node root) throws Exception {
        if (root == null) {
            throw new Exception("Tree is empty can not find min");
        }
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    public static Node findMinimum(Node root) throws Exception {
        if (root == null) {
            throw new Exception("Tree is empty can not find min");
        }
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    private static int findMax(Node root) throws Exception {
        if (root == null) {
            throw new Exception("Tree is empty can not find max");
        }
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

    private static int findHeight(Node root) {
        if (root == null) {
            return -1;
        } else {
            return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
        }
    }

    private static int findMaxDepth(Node root){
        if(root ==null){
            return 0;
        }else{
            return Math.max(findMaxDepth(root.left),findMaxDepth(root.right))+1;
        }
    }

    public static void levelOrderTraversal(Node root) {
        if (root == null) {
            System.out.println("Tree is empty, Can not traverse");
        } else {
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                Node node = queue.poll();
                System.out.print(node.data + " ");
                if (null!=node.left) {
                    queue.add(node.left);
                }
                if (null!=node.right) {
                    queue.add(node.right);
                }
            }
        }

    }
    public static void preorderTraversal(Node root){
        if(root ==null){
            return;
        }else{
            System.out.print(root.data+" ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    public static void inorderTraversal(Node root){
        if(root ==null){
            return;
        }else{
            inorderTraversal(root.left);
            System.out.print(root.data+" ");
            inorderTraversal(root.right);
        }
    }

    public static void postTraversal(Node root){
        if(root==null){
            return;
        }else{
            postTraversal(root.left);
            postTraversal(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static boolean isBst(Node root){
        if (root ==null){
            return true;
        }
        if(isLeftSubtreeLesser(root.left, root.data) && isRightSubtreeGreater(root.right,root.data)
        && isBst(root.left) && isBst(root.right)){
            return true;
        }else{
            return false;
        }
    }

    private static boolean isRightSubtreeGreater(Node root, int data) {
        if(root ==null){
            return true;
        }
        if(root.data>data && isRightSubtreeGreater(root.left,data) && isRightSubtreeGreater(root.right,data)){
            return true;
        }else{
            return false;
        }
    }

    private static boolean isLeftSubtreeLesser(Node root, int data) {
        if(root ==null){
            return true;
        }
        if(root.data<=data && isLeftSubtreeLesser(root.left, data) && isLeftSubtreeLesser(root.right,data)){
            return true;
        }else{
            return false;
        }
    }

    public static Node delete(Node root, int val) throws Exception {
        if(root==null){
            return root;
        }else if(val<root.data){
            root.left=delete(root.left,val);
        }else if(val>root.data){
            root.right=delete(root.right,val);
        }else{
            System.out.println("We have found the value to be deleted "+ root.data);
            //Handle the first case, When left child and right child of root are null
            if(root.left==null && root.right == null){
                root=null;
            }else if(root.left==null){
                root = root.right;
            }else if(root.right==null){
                root=root.left;
            }else{
                Node temp =findMinimum(root.right);
                root.data=temp.data;
                root.right=delete(root.right,temp.data);
            }
        }
        return root;
    }


    public static void main(String[] args) throws Exception {
        Node rootTemp = null;
        List<Integer> nums = NumbersUtil.generateRandomList(1, 100, 10);
        //System.out.println(nums);
        Integer arr[]={35, 86, 50, 2, 22, 39, 2, 38, 95, 66};
        nums.clear();
        nums= Arrays.asList(arr);
        System.out.println(nums);
        for (Integer n : nums) {
            rootTemp = add(rootTemp, n);
        }

        BTreePrinter.printNode(rootTemp);
        System.out.println("Height of tree is: " + findHeight(rootTemp));
        System.out.println("Max Depth of tree is :"+findMaxDepth(rootTemp));
        //System.out.println("Is BT is BST :"+isBst(rootTemp));
        search(rootTemp, 22);
        search(rootTemp, -2);
//        System.out.println("Min is :" + findMin(rootTemp));
//        System.out.println("Max is :" + findMax(rootTemp));
//        System.out.println("Min using recursion :" + findMinRecursion(rootTemp));
//        System.out.println("Max using recursion :" + findMaxRecursion(rootTemp));
//        System.out.println("Level Order Traversal");
//        levelOrderTraversal(rootTemp);
//        System.out.println();
//        System.out.println("Preorder Traversal");
//        preorderTraversal(rootTemp);
//        System.out.println();
//        System.out.println("Inorder Traversal");
//        inorderTraversal(rootTemp);
//        System.out.println();
//        System.out.println("Postorder Traversal");
//        postTraversal(rootTemp);
//        System.out.println();
//        System.out.println(Math.max(-1,-1)+1);
//        rootTemp =delete(rootTemp,38);
//        BTreePrinter.printNode(rootTemp);
//
//        rootTemp =delete(rootTemp,39);
//        BTreePrinter.printNode(rootTemp);
//
//        rootTemp =delete(rootTemp,86);
//        BTreePrinter.printNode(rootTemp);

    }
}

