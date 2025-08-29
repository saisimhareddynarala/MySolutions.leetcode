class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        if(nums[nums.length/2 - 1] == nums[nums.length/2]) return nums[nums.length/2];
        else if(nums[nums.length/2] == nums[nums.length-1]) return nums[nums.length-1];
        else return nums[0];
      // return nums[nums.length/2 - 1];
       // return 0;
    }
}