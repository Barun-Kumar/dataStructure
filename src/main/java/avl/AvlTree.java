package avl;

import com.util.NumbersUtil;
import tree.bst.BTreePrinter;

public class AvlTree {

    public static int height(Node root){
        if(root ==null){
            return -1;
        }else{
            return Math.max(height(root.left),height(root.right))+1;
        }
    }

    public static int getBalance(Node root){
        return height(root.left)-height(root.right);
    }

    /**
     *      Original tree
     *
     *          9 (y)
     *        /
     *       5  (x)
     *     /   \
     *    4     6 (T2)
     *
     *    right rotate
     *      5  (x)
     *    /   \
     *   4     9 (y)
     *        /
     *       6 (T2)
     * @param y
     * @return
     */
    public static Node rotateRight(Node y){
        Node x = y.left;
        Node t2 = x.right;
        x.right=y;
        y.left =t2;

        //y.height = height(y);
        //x.height = height(x);
        return x;
    }

    public static Node rotateLeft(Node x){
        Node y= x.right;
        Node t2 = y.left;
        y.left=x;
        x.right=t2;
        //y.height = height(y);
        //x.height = height(x);
        return y;
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        //Update height of ancestor node
        root.height=  Math.max(height(root.left),height(root.right))+1;
        int balance = getBalance(root);
        //It is a left - left case, Rotate right
        if (balance >1 && data < root.left.data) {
            System.out.println("Rotating right");
            return rotateRight(root);
        }
        // left - right case
        else if (balance > 1 && data > root.left.data) {
            System.out.println("Rotating left and then right");
            root.left = rotateLeft(root.left);
            return rotateRight(root);
        }
        // right - right case
        else if(balance <- 1 && data > root.right.data){
            System.out.println("Rotating left");
            return rotateLeft(root);
        }
        // Right - Left case
        else if(balance < -1 && data < root.right.data){
            System.out.println("Rotating right and then left");
            root.right = rotateRight(root.right);
            return rotateLeft(root);
        }

        return root;
    }

    public static void main(String[] args) {
       // int[] nums=NumbersUtil.generateRandomArray(0,50,10);
        int[] nums={30, 0, 18, 31, 6, 27, 32, 18, 15, 50};
        Node root=null;
        NumbersUtil.printArrayInSingleLine(nums);
        for (Integer i: nums){
            root=insert(root,i);
        }
        height(root);
        AvlTreePrinter.printNode(root);


    }
}
