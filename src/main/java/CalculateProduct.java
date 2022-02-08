import tree.bst.Node;

public class CalculateProduct {
    public static int result=1;
    public static void main(String[] args) {
        Node root = null;
        calculateProductOfLeafNodes(root);


    }

    public static void calculateProductOfLeafNodes(Node root){
        if(root!=null && root.left==null && root.right==null){
            System.out.println("Found leaf node");
            result=result*root.data;
        }else if(root==null){
            return;
        }
        else{
            calculateProductOfLeafNodes(root.left);
            calculateProductOfLeafNodes(root.right);
        }
    }

}
