class Solution {
    public int maxProfit(int[] prices) {
      
        int buy = prices[0];
        int x = 0;

        for(int i=0;i<prices.length;i++){
          if(buy > prices[i]){
           buy  = prices[i];
          }
          if(prices[i] > buy){
            int z = prices[i] - buy;
         x =  Math.max(z , x);
          }
        }
        return x;
    
    }
}