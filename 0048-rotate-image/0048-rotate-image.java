class Solution {
    public void rotate(int[][] matrix) {
       int[][] ar = new int[matrix.length][matrix.length];
       int y = 0;
        for(int i=0;i < matrix.length;i++){
            for(int j=0,x=matrix.length - 1; j < matrix.length;j++,x--){
                ar[i][j] = matrix[x][y];
               
            }
            
            y++;

        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j] = ar[i][j];
            }
        }
        
    }
}