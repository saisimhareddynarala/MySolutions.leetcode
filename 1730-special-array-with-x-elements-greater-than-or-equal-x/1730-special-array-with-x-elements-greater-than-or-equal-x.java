class Solution {
    public int specialArray(int[] nums) {
        int x = nums.length;
        int c=0;
        for(int i=0;i<=nums.length;i++){
            c=0;
            for(int j=0;j<nums.length;j++){
                    if(nums[j] >= i){
                        c++;
                    }
            }
            if(c==i)
            return i;
        }
        return -1;
    }
}