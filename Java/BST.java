// binary tree - atmost 2 child nodes
// bst - on left - data is less
// and on right its more
// does not take duplicates

// on inorder traversal it comes in a sorted array

// T = O(h)
// S = O(h)




import javax.swing.tree.TreeNode;

public class BST{

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }


// insert
  public static TreeNode insert(TreeNode root, int val) {
        if(root == null)    return new TreeNode(val);
        else if(val<root.val)  root.left= insert(root.left, val);
        else if(val>root.val) root.right= insert(root.right, val);
        return root;
  }

  // search
  public static TreeNode searchBST(TreeNode root, int val) {
    if(root==null || root.val==val) return root;
    if(root.val<val)    return searchBST(root.right, val);
    else{
        return searchBST(root.left, val);
    }

}

// delete
  // leaf node
  // non-leaf node(we will go by successor bcoz succession is the law of nature but you must check on the sub-tree that is available)
  public static int successor(TreeNode root){
        root = root.right;
        while(root.left!=null){
            root = root.left;
        }
        return root.val;
    }

    public static int predecessor(TreeNode root){
        root = root.left;
        while(root.right!=null){
            root = root.right;
        }
        return root.val;
    }

    public static  TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }

        if(root.val<key)    root.right=deleteNode(root.right, key);
        else if(root.val>key)   root.left=deleteNode(root.left, key);
        else{
            if(root.left==null && root.right==null){
                root=null;
            }
            else if(root.right!=null){
                root.val = successor(root);
                root.right= deleteNode(root.right, root.val);
            }
            else if(root.left!=null){
                root.val = predecessor(root);
                root.left = deleteNode(root.left, root.val);
            }
        }
        return root;
    }

  public static void main(String[] args) {
    TreeNode node = new TreeNode(5);
    insert(node, 9);
    insert(node, 11);
    TreeNode search = searchBST(node, 11);
     TreeNode delete =deleteNode(node,5);
    System.out.println(node.val);        
    System.out.println(node.right.val);
    System.out.println(search.val);
    System.out.println(delete.val);
  }
}