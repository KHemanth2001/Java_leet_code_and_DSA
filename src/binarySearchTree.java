public class binarySearchTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root, int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static boolean BinarySearch(Node root, int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }else if(root.data>key){
            return BinarySearch(root.left,key);
        }else{
            return BinarySearch(root.right,key);
        }
    }
    public static Node delete(Node root, int data){
        if(root.data>data) {
            root.left = delete(root.left,data);
        }else if(root.data<data){
            root.right=delete(root.right,data);
        }else{
            //case1 - if there is no child node
            if(root.left==null && root.right == null){
                return null;
            }
            //case2 - check if the node has child nodes either on left or right side.
            else if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            //case3 - if the node has two children
            Node is=isSuccessor(root.right);
            root.data=is.data;
            root.right=delete(root.right,is.data);
        }
        return root;
    }
    public static Node isSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void main(String[] args) {
            int[] vals={5,1,3,4,2,7};
            Node root=null;
            for (int val : vals) {
                root = insert(root, val);
            }
            inOrder(root);
        System.out.println();
            root=delete(root,3);
            inOrder(root);
            System.out.println();
            if(BinarySearch(root,8)){
                System.out.println("found");
            }else{
                System.out.println("not found");
            }

    }
}
