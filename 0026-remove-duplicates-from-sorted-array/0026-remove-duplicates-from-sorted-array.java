class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        int x = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[j]!=nums[i]){
             
                nums[j+1] = nums[i];
        j++;

            }
        }
        return j+1;
    }
}