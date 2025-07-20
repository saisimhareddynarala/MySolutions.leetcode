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
   public static ArrayList<Integer> x;
    public int kthSmallest(TreeNode root, int k) {
       x = new ArrayList<>();
       level(root);
       Collections.sort(x);
       return x.get(k-1);
    }
    private static void level(TreeNode r){
        if(r==null) return;
        x.add(r.val);
        level(r.left);
        level(r.right);
       
        // Queue<TreeNode> q = new LinkedList<>();
        // if(r==null) return ;
        // q.add(r);
        // int v;
        // while(q.size() > 0){
        //     TreeNode cur = q.poll();
        //      if(cur==null){ x.add(-1); continue;}
        //      else  v = cur.val;
        //      x.add(v);
        //     if(cur.left!=null) q.add(cur.left);
        //     else q.add(null);
        //     if(cur.right!=null) q.add(cur.right);
        //     else q.add(null);
          
            
        // }
        // Collections.sort(x);
        
       
    }
}