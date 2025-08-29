class Solution {
    public int findShortestSubArray(int[] nums) {
       HashMap<Integer , Integer> x = new HashMap<>();
       for(int i: nums)
       x.put( i , x.getOrDefault(i , 0)+1) ;
       int max = 0;
   //    int c = 0;
        ArrayList<Integer> li = new ArrayList<>();
       for(int i : nums){
            max = Math.max(x.get(i) ,max);
       }
       for(int i: nums){
        if(x.get(i)==max) li.add(i);
       }
       System.out.println();
      int ans = Integer.MAX_VALUE;
       for(int c: li){
         int f = 0,s=0;
       for(int i=0; i< nums.length ; i++ ){
            if(nums[i] == c ) {
                f = i;

                break;
            }
        
       }
       for(int i=nums.length-1; i >=0  ; i-- ){
            if(nums[i] == c ) {
                s = i;

                break;
            }
        
       }
        ans = Math.min(ans , s-f+1);
       }
       return ans;

    }
}