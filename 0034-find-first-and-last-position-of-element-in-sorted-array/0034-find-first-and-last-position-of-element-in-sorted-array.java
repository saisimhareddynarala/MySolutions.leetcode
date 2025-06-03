class Solution {
    public int[] searchRange(int[] nums, int target) {
        int c=-1,d=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]== target)
            {
                c=i;
                break;
            }
        }for(int i=nums.length-1;i>=0;i--){
            if(nums[i]== target)
            {
                d=i;
                break;
            }
        }
        int[] ar = {c,d};
        return ar;
    }
}