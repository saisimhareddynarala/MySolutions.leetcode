class Solution {
    public int subarraySum(int[] nums, int k) {
    HashMap<Integer , Integer> x = new HashMap<>();
    int[] pf = new int[nums.length];
    pf[0] = nums[0];
    for(int i=1 ; i<nums.length ; i++){
        pf[i] = pf[i-1] + nums[i];
    }
    int cnt = 0;
    for(int i = 0 ; i< nums.length ; i++){
        if(pf[i]==k) cnt++;
        if(x.containsKey(pf[i]-k)){
            cnt  = cnt + x.get(pf[i]-k);
        }
        x.put(pf[i] , x.getOrDefault(pf[i],0)+1);
    }
    return cnt;
        
    }
}