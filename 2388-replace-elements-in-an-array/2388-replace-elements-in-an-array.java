class Solution {
    public int[] arrayChange(int[] nums, int[][] ons) {
        HashMap<Integer , Integer> x= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            x.put(nums[i] , i);
        }
        for(int i=0;i<ons.length ; i++){
            int v = ons[i][1];
            nums[x.get(ons[i][0])] = v;
            x.put(v , x.get(ons[i][0]));
        }
        return nums;
    }
}