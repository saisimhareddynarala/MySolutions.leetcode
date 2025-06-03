class Solution {
    public void setZeroes(int[][] matrix) {
        int[][] ar = new  int[matrix.length][matrix[0].length];
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               ar[i][j] = matrix[i][j] ;
            }
            
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    for(int c = 0; c < matrix[0].length ; c++ ){
                        ar[i][c] = 0;
                    }
                    for(int r=0;r<matrix.length;r++){
                        ar[r][j] = 0;
                    }



                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = ar[i][j];
            }
            
        }




    }
}