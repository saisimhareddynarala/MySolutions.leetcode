class Solution {
    public int kthSmallest(int[][] m , int k) {
        PriorityQueue<Integer> q =new PriorityQueue<>();
        int n = m.length;
        for(int i=0; i< n;i++){
            for(int j = 0 ; j<n; j++){
                    q.add(m[i][j]);
            }
        }
        int ans =0;
        while( k-- > 0){
            ans = q.poll();
        }
        return ans;
    }
}