class Solution {
    public int[] nextGreaterElements(int[] nums) {
       int[] ar = new int[2*nums.length];
       for(int i = 0;  i< nums.length ; i++){
        ar[i] = nums[i];
        ar[i+nums.length] = nums[i];
       } 
       int[] ans = new int[nums.length];
       for(int i =  0 ; i< nums.length ; i++){
        int cn = 0;
        for(int j = i+1 ; j< ar.length ; j++){
            if(ar[j] > ar[i]){
                ans[i] = ar[j];
                cn++;
                
                break;
            }
            if(cn==0) ans[i] = -1;
        }
       }
       return ans;
    }
}