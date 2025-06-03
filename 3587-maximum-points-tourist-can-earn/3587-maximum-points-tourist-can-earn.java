class Solution {
    public int maxScore(int n, int k, int[][] st, int[][] tra) {
        int[][] ar = new int[k+1][n];
        for(int i=1;i<=k;i++){
            for(int j=0;j<n;j++){
                ar[i][j] = ar[i-1][j] + st[i-1][j];
                for(int l=0;l<n;l++){
                    if(l!=j){
                        ar[i][j] = Math.max(ar[i][j], ar[i-1][l] + tra[l][j] );
                                
                    }
                }
            }
        }

        int mm = 0;
        for(int z=0;z<n;z++){
            mm = Math.max(mm,ar[k][z]);
        }
        return mm;
    }
}