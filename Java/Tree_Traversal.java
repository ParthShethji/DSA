// non linear data structure
// used when there is heirarchy availaible

// there are 2 traversals BFS and DFS

// DFS - Inorder Traversal, PreOrder, PostOrder


import java.util.ArrayList;
import java.util.List;

public class Tree_Traversal {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // ---------------------------------------------------------------------------------

     public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l1=new ArrayList<Integer>(); 
        if(root==null)
            return l1;
        inorderTraversal(root.left);
        l.add(root.val);
        inorderTraversal(root.right);
        return l1;
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<Integer>(); 
        if(root==null)
            return l;
        l.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return l;
    }


public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l2=new ArrayList<Integer>(); 
        if(root==null)
            return l2
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        l.add(root.val);
        return l2;
    }


    // T = O(n)
    // S = O(h)  h - height of tree

    // ---------------------------------------------------------------------------------

    public static void main(String[] args) {

    }
}