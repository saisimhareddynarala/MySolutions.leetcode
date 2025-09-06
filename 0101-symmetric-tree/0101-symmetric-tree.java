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
   // static ArrayList<Integer> x;
    static boolean sym(TreeNode left , TreeNode right){
        if(left==null && right==null) return true;
        if(left==null || right==null) return false;
        return left.val==right.val && sym(left.left  , right.right) && sym(left.right  ,right.left);
       
       
     

    }
    public boolean isSymmetric(TreeNode root) {
       
       return sym(root.left , root.right);
       // return true;
    }
}