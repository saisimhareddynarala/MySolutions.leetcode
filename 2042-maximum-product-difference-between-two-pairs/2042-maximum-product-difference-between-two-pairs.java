class Solution {
    public int maxProductDifference(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            if(min > nums[i])
            min = nums[i];
            if(max < nums[i])
            max = nums[i];
        }
        Arrays.sort(nums);
        int c  = 0;
        int smin = nums[0];
        int smax = nums[0];
        for(int i=1;i<nums.length-1;i++){
            if(nums[i] <= max)
            smax = nums[i];
            if(nums[i] >= min){
            c++;
            }
            if(c==1){
                smin = nums[i];
            }
        }
        int res = (max * smax) - ( min * smin);
        return res;
        
    }
}