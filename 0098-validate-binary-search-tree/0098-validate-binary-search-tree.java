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
  // static boolean flag = true; 
  long v = Long.MIN_VALUE;
    // public boolean traver(TreeNode r){
    //     if(r==null) return true;
    //     traver(r.left);
    //    // System.out.print(r.val+" ");
    //     if(r.val > v) v = r.val;
    //     else{
           
    //         return false;
    //     }
    //     System.out.print(v+" ");
    //     traver(r.right);
    //    // x.add(r.val);
    //    // traver(r.right);
    //     // TreeNode l = null ,ri = null;
    //     // if(r.left!=null) l = r.left;
    //     // if(r.right!=null)  ri  = r.right;
    //     // if(l!=null){
    //     //     if(l.val >= r.val){
    //     //         flag = false;
    //     //         return;
    //     //     }
    //     // }
    //     //  if(ri!=null){
    //     //     if(ri.val <= r.val){
    //     //         flag = false;
    //     //         return;
    //     //     }
    //     // }
    //     // traver(r.left);
      
    //     // traver(r.right);
    //     return true;
    // }
    public boolean isValidBST(TreeNode root) {
       // x = new ArrayList<>();
    if(root == null) return true;
    if(!isValidBST(root.left)) return false;
    if(root.val > v ) v = root.val;
    else return false;
    if(! isValidBST(root.right)) return false;;
       
       return true;
    }
}