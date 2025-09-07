class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        //int[] ar = new int[grid.lenth*grid.length];
        int[] ar = new int[2];
        HashSet<Integer> x = new HashSet<>();
        for(int i = 0 ; i< grid.length ; i++){
            for(int j = 0 ; j< grid.length ; j++){
                if(x.contains(grid[i][j])){
                    ar[0] = grid[i][j];
                   
                }
                else x.add(grid[i][j]);
            }
        }
        for(int i = 1 ; i<=grid.length*grid.length ; i++){
            if(!x.contains(i)){
                ar[1] = i;
                break;
            }
        }
        return ar;


    }
}