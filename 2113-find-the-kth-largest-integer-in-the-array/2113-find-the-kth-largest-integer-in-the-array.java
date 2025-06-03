import java.math.*;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        
      
       BigInteger[] br = new BigInteger[nums.length];


       
        for(int i=0;i<nums.length;i++){
            br[i] = new BigInteger(nums[i]);
        }
        Arrays.sort(br);
        int z = br.length - k;
       
        return br[z] + "";
        
    }
}