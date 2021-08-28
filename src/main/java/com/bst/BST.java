package com.bst;
class Node{
    int data;
    Node left;
    Node right;
}
public class BST {
    boolean isBST(Node root)
    {
        if(root==null){
            return true;
        }

        return BST.isLeftSubtreeLesser(root.left, root.data)
                && BST.isLeftSubtreeGreatter(root.right, root.data)
                && isBST(root.left)
                && isBST(root.right);

    }

     static boolean isLeftSubtreeLesser(Node root, int value){
        if(root==null){
            return true;
        }
         return root.data < value && isLeftSubtreeLesser(root.left, value) && isLeftSubtreeLesser(root.right, value);
    }

     static boolean isLeftSubtreeGreatter(Node root, int value){
        if(root==null){
            return true;
        }
         return root.data > value && isLeftSubtreeGreatter(root.left, value) && isLeftSubtreeGreatter(root.right, value);
    }
}
