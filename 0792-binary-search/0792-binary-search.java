class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length-1;
        int m = -1;
        while(l<=h){
            m = (l+h)/2;
            if(target ==nums[m])
            return m;
            else if(nums[m] < target){
                l=m+1;
            }
            else
            h=m-1;
        }
        return -1;
        
    }
}