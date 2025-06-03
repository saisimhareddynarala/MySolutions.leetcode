class Solution {
    public int[] getFinalState(int[] nums, int k, int multi) {

        while(k-- > 0){
           int  min = nums[0];
           int x = 0,c=0;
            for(int i=0;i<nums.length;i++){
                if(min > nums[i]){
                   min = nums[i];
                }
            }
        
                for(int i=0 ; i < nums.length;i++){
                if(min == nums[i]){
                nums[i] = nums[i]*multi;
                break;
                }
                
            }
        }
        return nums;







    }
}