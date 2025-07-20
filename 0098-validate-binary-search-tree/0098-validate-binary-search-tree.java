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
   static ArrayList<Integer> x;
    public static void traver(TreeNode r){
        if(r==null) return;
        traver(r.left);
        x.add(r.val);
        traver(r.right);
        // TreeNode l = null ,ri = null;
        // if(r.left!=null) l = r.left;
        // if(r.right!=null)  ri  = r.right;
        // if(l!=null){
        //     if(l.val >= r.val){
        //         flag = false;
        //         return;
        //     }
        // }
        //  if(ri!=null){
        //     if(ri.val <= r.val){
        //         flag = false;
        //         return;
        //     }
        // }
        // traver(r.left);
      
        // traver(r.right);
    }
    public boolean isValidBST(TreeNode root) {
        x = new ArrayList<>();
        traver(root);
        for(int i=0;i < x.size()-1; i++){
            if(x.get(i) >= x.get(i+1))
            return false;
        }
        return true;
        
    }
}