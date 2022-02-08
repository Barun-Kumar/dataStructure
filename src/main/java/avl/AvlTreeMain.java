package avl;

import com.util.NumbersUtil;
import tree.bst.Node;

import java.util.List;

public class AvlTreeMain {

    public static int findHeight(Node node){
        if(node ==null){
            return 0;
        }else{
            return node.height;
        }
    }
    public static int findBalance(Node node) {
        if (node == null) {
            return 0;
        } else {
            return findHeight(node.left) - findHeight(node.right);
        }
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
    private static Node rotateRight(Node y) {
        System.out.println("Rotating right, printing before rotating it");
        AvlTreePrinter.printNode(y);
        Node x= y.left;
        Node T2 = x.right;
        x.right=y;
        y.left=T2;

        //Update the height nof the node
        x.height = Math.max(findHeight(x.left),findHeight(x.right))+1;
        y.height = Math.max(findHeight(y.left),findHeight(y.right))+1;
        System.out.println("After right rotation");
        AvlTreePrinter.printNode(x);
        //return the new root;
        return x;

    }

    /**
     * Rotate left
     *         8 (x)
     *          \
     *          10  (y)
     *        /   \
     *  (T2) 9     11
     *
     *      10 (y)
     *    /   \
     *(x)8    11
     *    \
     *     9 (T2)
     * @param x
     * @return
     */
    private static Node rotateLeft(Node x){
        System.out.println("Rotating left, printing before rotating it");
        AvlTreePrinter.printNode(x);
            Node y= x.right;
            Node T2 = y.left;
            y.left=x;
            x.right=T2;

            //Update the height of left x and y
        x.height = Math.max(findHeight(x.left),findHeight(x.right))+1;
        y.height = Math.max(findHeight(y.left),findHeight(y.right))+1;
        System.out.println("After left rotation");
        AvlTreePrinter.printNode(y);

        //return the new root;
        return y;
    }



    /**
     * Insert node while balancing it
     * @param 'root' node reference of root node
     * @param val value to be inserted
     * @return root node reference
     */
    public static Node insert(Node node, int val){
        if(node ==null){
            Node n = new Node(val);
            return n;
        }else if(val<node.data){
              node.left=insert(node.left,val);
        }else{
             node.right=insert(node.right,val);
        }
        //Update height of ancestor node
        node.height=  Math.max(findHeight(node.left),findHeight(node.right))+1;
        int balance = findBalance(node);
        // LEFT LEFT
        if(balance > 1 && val < node.left.data){
            return rotateRight(node);
         //LEFT RIGHT
        } if(balance >1 && val> node.left.data){
            node.left = rotateLeft(node.left);
            return rotateRight(node);
         //RIGHT RIGHT
        } if(balance <-1 && val >node.right.data){
           return rotateLeft(node);
         //RIGHT LEFT
        } if(balance <-1 && val < node.right.data){
            node.right=rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;

    }




    public static void main(String[] args) {
        Node root = null;
        List<Integer> nums = NumbersUtil.generateRandomList(1, 20, 5);
        for(Integer n : nums){
            root=insert(root,n);
        }
        AvlTreePrinter.printNode(root);
    }
}
