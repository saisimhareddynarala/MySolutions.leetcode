class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int c=0,x=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1] && i%3!=2){
                x = nums[i];
                c++;
                break;
            }
        }
        if(c!=0)
        return x;
       
        return nums[nums.length-1];
    }
}