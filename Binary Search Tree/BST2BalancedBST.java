import java.util.*;

public class BST2BalancedBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    
    public static void getInorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node balancedBST(ArrayList<Integer> inoder, int st, int end){
        if(st > end){
            return null;
        }
        
        int mid = (st+end)/2;
        Node root = new Node(inoder.get(mid));
        root.left = balancedBST(inoder, st, mid-1);
        root.right = balancedBST(inoder, mid+1, end);

        return root;
    }
    
    public static Node BSTtoBalanceBST(Node root){
        ArrayList<Integer> inorder = new ArrayList<>();
            getInorder(root, inorder);

            root = balancedBST(inorder, 0, inorder.size()-1);
            return root;
    }
    public static void main(String[] args) {
      Node root = new Node(8);
      root.left = new Node(6);
      root.left.left = new Node(5);
      root.left.left.left = new Node(3);

      root.right = new Node(10);
      root.right.right = new Node(11);
      root.right.right.right = new Node(12);

      root = BSTtoBalanceBST(root);
      preorder(root);

    }    
}
