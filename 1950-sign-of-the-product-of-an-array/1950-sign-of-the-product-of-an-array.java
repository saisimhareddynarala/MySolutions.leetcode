class Solution {
    public int arraySign(int[] nums) {
        long pr = 1;
        for(int i=0;i<nums.length;i++){
            pr = (pr * nums[i])%1000000007;
        }
       
        if(pr < 0)
        return -1;
        if(pr == 0)
        return 0;
        return 1;
    }
}