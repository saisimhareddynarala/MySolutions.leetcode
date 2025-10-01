class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs , Comparator.comparingInt(a->a[1]));
        int ans = 1;
        int[] prev = pairs[0];
        for(int i=1 ; i< pairs.length ; i++){
            int[] cur = pairs[i];
            if(cur[0] > prev[1]){
                ans++;
                prev = cur;
            }
        }
        return ans;
    }
}