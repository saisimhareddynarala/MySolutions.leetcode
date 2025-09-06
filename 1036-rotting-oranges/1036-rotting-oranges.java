class Solution {
    static class Pair{
        int row , col ,  tim;
        Pair(int i , int j , int t){
            this.row = i;
            this.col= j;
            this.tim = t;
        }
    }
    int bfs(int[][] grid , int m , int n){
        Queue<Pair> q = new LinkedList<>();
        int[][] vis = new int[n][m];
        int cn = 0;
        for(int i=0; i< n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i,j,0));
                    vis[i][j] = 2;
                }
                else{
                    vis[i][j] = 0;
                }
                if(grid[i][j]==1) cn++;
            }
        }
        int time = 0;
        int[] dr = {-1 , 0 , 1 , 0};
        int[] dc = { 0 , 1 , 0 , -1};
        int cnt = 0;
        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().tim;
            q.remove();
            time = Math.max(time , t);
            for(int i = 0 ; i < 4 ; i++){
                int nr = r+dr[i];
                int nc =c + dc[i];
                if(nr >= 0  && nc >= 0  && nr  < n && nc < m && vis[nr][nc]==0 && grid[nr][nc] == 1){
                    q.add(new Pair(nr ,nc , t+1));
                    vis[nr][nc] = 2;
                    cnt++;
                }
            }

        }
        if(cnt!=cn) return -1;
        return time;
    }
    public int orangesRotting(int[][] grid) {
        return bfs(grid , grid[0].length , grid.length);
    }
}