class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int c1 = 0,c2 = 0;
        int ar[] = new int[2];
        int max = mat[0][0];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(max < mat[i][j])
                {
                    max = mat[i][j];
                    c1 = i;
                    c2 = j;
                }
            }
        }
        ar[0] = c1;
        ar[1] = c2;
        return ar;
    }
}