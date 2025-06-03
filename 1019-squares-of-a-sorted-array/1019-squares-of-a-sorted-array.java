class Solution {
    public int[] sortedSquares(int[] nums) {
       int[] ar = new int[nums.length];
       for(int i=0;i<nums.length;i++){
        ar[i] = (int)Math.pow(nums[i],2);
       } 
        Arrays.sort(ar);
        return ar;
    }
}