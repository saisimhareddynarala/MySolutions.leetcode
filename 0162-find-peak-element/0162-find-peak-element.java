class Solution {
    public int findPeakElement(int[] nums) {
        int i,j,max=nums[0],c=0,d=0;
        if(nums.length==1)
        return 0;
            for(i=0;i<nums.length;i++){
                if(max < nums[i]){
                    max = nums[i];
                    c=i;
                }
              
            }
        
      
        for( j=1;j<nums.length-1;j++){
            if((nums[j] > nums[j-1] && nums[j] > nums[j+1]))
            {
              break;
            }
            d++;
    
        }
        
        
        if(d !=nums.length-2 ){
            return j;
        }
        else
        return c;
    }
}