class Solution {
    public int minimumAverageDifference(int[] nums) {
        long[] ar = new long[nums.length];
        if(nums.length==1)
            return 0;
    long sum = 0;
        for(int i=0;i < nums.length;i++){
                sum = (sum + nums[i]);
        }
         long in = 0;
         int x=0;
        long f=0,s=0;
        
        for(int i=0;i<nums.length;i++){
            sum = ((sum - nums[i] ));
            if(i == nums.length - 1){
                s = 0;
            }
            else
            s = sum/(nums.length - i - 1);
            in = (in + nums[i]);
            f = in / (i+1);
            ar[i] =Math.abs(f-s);
            
        }
        long min = ar[0];
        for(int i=0;i<ar.length;i++){
            if(min > ar[i]){
            min = ar[i];
            x = i;
            }

        }
        return x;
        
    }
}