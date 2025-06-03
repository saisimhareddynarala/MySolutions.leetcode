class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum = 0,fs = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
        }int c  = 0;
        for(int i=0;i<nums.length;i++){
                fs = fs + nums[i];
                sum = sum - nums[i];
                if(fs >= sum && i < nums.length-1){
                        c++;
                }
        }
        return c;
    }
}