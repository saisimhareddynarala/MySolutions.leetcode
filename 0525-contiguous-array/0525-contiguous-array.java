class Solution {
    public int findMaxLength(int[] nums) {
        int ans = 0;
        HashMap<Integer , Integer> x = new HashMap<>();
        x.put(0 , -1);
        int c = 0;
        for(int i= 0; i < nums.length ; i++){
            if(nums[i]==1) c++;
            else c--;
            if(x.containsKey(c)){
                ans = Math.max(ans , i - x.get(c));
            }
            else x.put(c , i);
        }
        return ans;
    }
}