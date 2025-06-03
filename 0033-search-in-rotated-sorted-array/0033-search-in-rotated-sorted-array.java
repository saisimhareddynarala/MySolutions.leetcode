class Solution {
    public int search(int[] nums, int target) {
        int c = 0,b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                b = i;
                break;
            }
            c++;
        }
        if(c == nums.length)
        return -1;
        else
        return b;
    }
}