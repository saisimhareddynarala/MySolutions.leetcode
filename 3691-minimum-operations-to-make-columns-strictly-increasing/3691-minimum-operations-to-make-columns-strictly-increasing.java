class Solution {
    public int minimumOperations(int[][] gg) {
         int m = gg.length,n = gg[0].length,res = 0;
        
            for (int j = 0; j < n; j++) { 
                            for (int i = 1; i < m; i++) {
                if (gg[i][j] <= gg[i - 1][j]) {
    res += (gg[i - 1][j] - gg[i][j] + 1);
                    gg[i][j] = gg[i - 1][j] + 1;
                }
            }
        }
        return res;
    }
}