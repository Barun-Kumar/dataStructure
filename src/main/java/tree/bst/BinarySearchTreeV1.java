package tree.bst;

public class BinarySearchTreeV1 {


    public static void main(String[] args) {
        Node root=null;

    }

    /**
     * Insert element in tree
     * @param root Root node
     * @param data data to be inserted in tree
     * @return root node
     */
    public static Node insert(Node root,int data){
        if(root==null){
            root= new Node(data);
        }else if(data<=root.data){
            root.left=insert(root.left,data);
        }else{
            root.right=insert(root.right,data);
        }
        return root;
    }

    /**
     *
     * @param root
     * @param data
     * @return
     */
    public static boolean search(Node root, int data){
        if(root==null){
            return false;
        }else if(data==root.data){
            return true;
        }else if(data< root.data){
            return search(root.left,data);
        }else{
            return search(root.right,data);
        }
    }

    /**
     * Given tree find the minimum element
     * @param root
     * @return Min element
     * @throws Exception
     */
    public static int findMin(Node root) throws Exception {
        if(root==null){
            throw new Exception("Tree is null can not find min");
        }else if(root.left==null){
            return root.data;
        }else{
            return findMin(root.left);
        }
    }

    /**
     * Given tree find the maximum element
     * @param root
     * @return max element
     * @throws Exception
     */
    public static int findMax(Node root) throws Exception {
        if(root==null){
            throw new Exception("Tree is null, Can not find max");
        }else if(root.right==null){
            return root.data;
        }else{
            return findMax(root.right);
        }

    }

    /**
     * Given a tree find the height of the tree
     * @param root
     * @return
     */
    public static int findHeight(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight= findHeight(root.left);
        int rightHeight=findHeight(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }

    public static Node delete(Node root, int data){
        if(root==null){
            return root;
        }else if(data<root.data){
            root.left = delete(root.left,data);
        }else if(data>root.data){
            root.right=delete(root.right,data);
        }else{
            System.out.println("Woo, Element is found to be deleted");
            if(root.left==null && root.right==null){
                root=null;
            }
        }
        System.out.println("Its is incomplete");
        return null;
    }

}
