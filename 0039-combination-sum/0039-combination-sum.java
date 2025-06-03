class Solution {
    public List<List<Integer>> combinationSum(int[] ca, int target) {
            List<List<Integer>> x = new ArrayList<>();
           
          
            ArrayList<Integer> y = new ArrayList<>();
            mym(ca , 0 , target , x , y);
            return x;
    }
    public static void mym(int[] a , int i , int tar , List<List<Integer>> x , ArrayList<Integer> g){
        if(tar == 0){
            x.add(new ArrayList<>(g));
            return;
        }
        if(i == a.length){
            if(tar == 0)    x.add(new ArrayList<>(g));
        
        return;
        }
        if(a[i] <= tar){
            g.add(a[i]);
            mym(a , i , tar-a[i] , x , g);
            g.remove(g.size()-1);
        }
        mym(a , i+1 , tar ,x , g);

    }
}