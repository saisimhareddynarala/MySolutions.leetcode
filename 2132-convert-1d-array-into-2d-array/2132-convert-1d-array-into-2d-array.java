class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] ar = new int[m][n];
        int x  = 0;
        int[][] a = new int[0][0];
        if(original.length != m*n)
        return a;
                for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                ar[i][j] = original[x++];
            }
        }
        return ar;
        
    }
}