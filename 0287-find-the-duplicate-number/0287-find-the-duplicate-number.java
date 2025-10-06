class Solution {
    public int findDuplicate(int[] nums) {
        for(int ele : nums)
        {
            int idx = Math.abs(ele);
            if(nums[idx] < 0) return idx;
            nums[idx] = -nums[idx];
        }
        return nums.length;
        
    }
}