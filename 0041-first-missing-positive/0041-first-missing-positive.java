class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        Map<Integer,Integer> x = new HashMap<>();
        for(int i=0;i<nums.length;i++){
           x.put(nums[i],x.getOrDefault(nums[i],0)+1);
        }
        for(int i=1;i<=nums.length+1;i++){
            if(x.get(i) == null)
            return i;
        }
        return 10;
    }
}