class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int x = 0;
        for(int i=0;i<prices.length;i++){
           int z = prices[i] - min;
           x = Math.max(x,z);
           min = Math.min(prices[i],min);
        }
        return x;
    
    }
}