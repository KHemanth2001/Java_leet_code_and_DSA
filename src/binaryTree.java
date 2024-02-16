import java.util.*;
public class binaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static void preOrder(Node root){
            if(root==null){
                System.out.print("-1 ");
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(Node root){
            if(root==null){
                System.out.print("-1 ");
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        public static void postOrder(Node root){
            if(root==null){
                System.out.print("-1 ");
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
        public static int countNodes(Node root){
            if(root==null){
                return 0;
            }
            int left=countNodes(root.left);
            int right=countNodes(root.right);
            return left+right+1;
        }
        public static int sumOfNodes(Node root){
            if(root==null){
                return 0;
            }
            int leftsum=sumOfNodes(root.left);
            int rightsum=sumOfNodes(root.right);
            return leftsum+rightsum+root.data;
        }
        public static int heightOfNodes(Node root){
            if(root==null){
                return 0;
            }
            int lefth=heightOfNodes(root.left);
            int righth=heightOfNodes(root.right);
            return (lefth>righth)? lefth+1:righth+1;
        }

        public static int diameter(Node root){
            if(root==null){
                return 0;
            }
            int diam1=diameter(root.left);
            int diam2=diameter(root.right);
            int diam3=heightOfNodes(root.left)+heightOfNodes(root.right)+1;

            return Math.max(Math.max(diam1,diam2),diam3);
        }
        public static void levelOrder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);

        tree.preOrder(root);
        System.out.println();

        tree.inOrder(root);
        System.out.println();

        tree.postOrder(root);

        System.out.println("level order");
        tree.levelOrder(root);

        int cnt=tree.countNodes(root);
        System.out.println(cnt);

        int sum=tree.sumOfNodes(root);
        System.out.println(sum);

        int h=tree.heightOfNodes(root);
        System.out.println(h);

        int d=tree.diameter(root);
        System.out.println(d);
    }
}
