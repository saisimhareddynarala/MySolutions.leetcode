class Solution {
    public int minElement(int[] nums) {
        int rem=0,min=10000000,sum=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                rem=nums[i]%10;
                sum+=rem;
                nums[i]=nums[i]/10;
            }
            nums[i]=sum;
            if(min>nums[i]){
                min=nums[i];
            }
            sum=0;
        }
        return min;
    }
}