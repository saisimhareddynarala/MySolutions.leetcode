class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1)
        return 0;
        int d = Integer.MIN_VALUE;
        for(int i = 0; i< nums.length-1;i++){
            if(nums[i+1] - nums[i] >  d)
            d = nums[i+1] - nums[i];

        }
        return d;
    }
}