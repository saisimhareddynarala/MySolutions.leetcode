class Solution {
    public int longestSubarray(int[] nums) {
        int max = nums[0];
        int c  = 1;
        if(nums.length == 1)
        return 1;
       for(int i=0;i<nums.length;i++){
        if(max<nums[i])
        max = nums[i];
    }
    int m = 0;
    for(int i=0;i<nums.length-1; i++){
        if(nums[i] == max && nums[i+1]==max)
        c++;
        else
        c = 1;
        m = Math.max(c,m);
    }
    return m;
    }
}