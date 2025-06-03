class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums.length == 1)
        return 0;
        int min = Integer.MAX_VALUE;
            int i=0;
        for(int j=k-1;j< nums.length;j++){
           int  dif = (nums[j] - nums[i]);
            min = Math.min(min , dif);
            i++;
        }
        

        return min;
    }
}