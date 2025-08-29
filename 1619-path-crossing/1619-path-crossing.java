class Solution {
    static class Pair{
        int x,y;
        Pair(int x , int y){
            this.x = x;
            this.y = y;
        }
    }
    public boolean isPathCrossing(String path) {
        int ns = 0;
        int ew = 0;
        // for(int i=0; i< path.length()-1 ; i++){
        //     if((path.charAt(i+1)== 'N'  &&  path.charAt(i) =='S' ) || (path.charAt(i) =='N' && path.charAt(i+1)=='S' )){
        //         return true;
        //     }
        //      if((path.charAt(i+1)== 'E'  &&  path.charAt(i) =='W' ) || (path.charAt(i) =='E' && path.charAt(i+1)=='W' )){
        //         return true;
        //     }
        // }
        HashSet<String> xx = new HashSet<>();
        int v =0;
        int x = 0 , y = 0;
        String sum = x +","+y;
        xx.add(sum);
        for(char c : path.toCharArray()){
            if(c=='N') y++;
            else if(c=='S') y--;
            else if(c=='E') x++;
            else x--;
             sum = x +","+y;
            if(xx.contains(sum)) return true;
            else
            xx.add(sum);
        }
        return false;
    }
}