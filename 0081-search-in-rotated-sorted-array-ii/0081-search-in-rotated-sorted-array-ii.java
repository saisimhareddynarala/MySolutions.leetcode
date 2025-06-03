class Solution {
    public boolean search(int[] nums, int target) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target)
            {
                break;
            }
            c++;
        }

    
    if(c == nums.length)
     return false;
    else
     return true;
    }
}