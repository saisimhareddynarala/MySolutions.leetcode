class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int[] ar = new int[nums.size()];
        int x = 0;
        for(int i: nums){
            ar[x++] =i;
        }
        int c = 0;
        for(int i=0;i<ar.length-1;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i] + ar[j] < target)
                c++;
            }
        }
        return c;
    }
}