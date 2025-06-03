class Solution {
    public int removeDuplicates(int[] nums) {
        int c  = 0;
        int x = 0;
        int[] ar = new int[nums.length];
        int n = nums.length;
        for(int i=0; i < nums.length - 1;i++){
            if(nums[i] == nums[i+1])
            {
                c++;
                      
            }
            else
            {
                ar[x] = nums[i];
                x++;
            }
        }
        ar[x] = nums[nums.length - 1];
        for(int i=0;i < n-c ; i++){
            nums[i] = ar[i];
        }
        return (n-c);
    }
}