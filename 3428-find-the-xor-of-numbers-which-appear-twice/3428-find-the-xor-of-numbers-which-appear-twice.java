class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Set<Integer> x  = new HashSet<>();
        Arrays.sort(nums);
        int[] ar = new int[20];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1])
                    x.add(nums[i]);
        }
        int ans = 0;
        for(int a:x){
            ans = ans^a;
        }
        return ans;
        
    }
}