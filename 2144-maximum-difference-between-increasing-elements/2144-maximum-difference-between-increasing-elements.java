class Solution {
    public int maximumDifference(int[] nums) {
        int max = 0;
        int c = 0;
        int dif = 0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                        if(nums[i] < nums[j]){
                         dif = nums[j] - nums[i];
                            c++;
                        }
                        max = Math.max(dif, max);
            }
           
        }
       
        if(c==0)
        return -1;
         return max;
    }
}