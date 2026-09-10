/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int averageOfSubtree(TreeNode root) {
        return traverse(root);

    }
    public int traverse(TreeNode node){
          if(node==null) return 0;
          int left=0;
          int right=0;
          if(node.left!=null){
            left=traverse(node.left);
          }
          if(node.right!=null){
            right=traverse(node.right);
          }
          if(node.val==sum(node)/count(node)){
            // System.out.println(node.val);
            return 1+left+right;
          }
          return left+right;
    }
    public int sum(TreeNode node){
        if(node==null) return 0;
        int right=0;
        int left=0;
        if(node.right!=null){
            right=sum(node.right);
        }
        if(node.left!=null){
            left=sum(node.left);
        }
        return node.val+right+left;
    }
    public int count(TreeNode node){
        if(node==null) return 0;
        int right=0;
        int left=0;
        if(node.left!=null){
            left=count(node.left);
        }
        if(node.right!=null){
            right=count(node.right);
        }
        return 1+left+right;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna