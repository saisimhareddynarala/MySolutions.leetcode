class Solution {
    public int removeElement(int[] nums, int val) {
        int[] ar = new int[nums.length];
        int x  = 0,c= 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val) {
                    ar[x] = nums[i];
                    x++;
                    c++;
            }
        }
        for(int i=0;i<ar.length ; i++){
            nums[i] = ar[i];
        }
        return c;
    
    }
}