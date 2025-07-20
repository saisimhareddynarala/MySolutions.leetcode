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
 static int cnt = 0;
 static int  ans = 0;
    public int kthSmallest(TreeNode root, int k) {
      // x = new ArrayList<>();
       level(root ,k);
       cnt = 0;
       return ans;
      
    }
    private static void level(TreeNode r , int k){
        if(r==null) return;
        level(r.left , k);
         cnt++;
         if(cnt == k) {
            ans = r.val;
            return;
         }
      //  x.add(r.val);
        
        level(r.right, k);
       
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