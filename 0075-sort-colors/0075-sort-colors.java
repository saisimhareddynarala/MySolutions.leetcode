class Solution {
    public void sortColors(int[] nums) {
        int l=0,m=0,h=nums.length-1;
        while(m <= h){
            if(nums[m]==0){
                swap(nums,m,l);
                l++;
                m++;
            }
            else if(nums[m]==2){
                swap(nums,m,h);
              //  m++;
                h--;
            }
            else m++;
        }
    }
    static void swap(int[] nums, int a, int b){
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;

    }
}