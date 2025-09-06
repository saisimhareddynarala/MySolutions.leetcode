class Solution {
    int[] dr = {0 , -1, 0 , 1};
    int[] dc = {-1 , 0 , 1 , 0};
    boolean dfs(int r , int c,  int i , int j , boolean[][] vis , char[][] grid, char strt , int n , int m){
        vis[r][c] = true;
        boolean cycle = false;
        for(int ii=0;ii < 4 ; ii++){
            int x = r+dr[ii];
            int y = c+dc[ii];
            if(x >= 0 && y >= 0 && x < n && y < m ){
                if(!(x==i && y==j)){
                if(grid[x][y] == strt){
                    if(vis[x][y]){
                        return true;
                    }
                    else{
                        cycle  = cycle | dfs(x , y , r, c, vis , grid , strt , n , m);
                    }
                }
                }
            }
        }
        return cycle;
    }
    public boolean containsCycle(char[][] grid) {
        int n  = grid.length;
        int m = grid[0].length;
        boolean cycle = false;
        boolean[][] vis = new boolean[n][m];
        for(int i=0; i < n ;i++){
            for(int j=0; j< m; j++){
                if(!vis[i][j])
                cycle = cycle | dfs(i , j , -1, -1 , vis , grid , grid[i][j] , n , m);
            }
        }
        return cycle;
    }
}