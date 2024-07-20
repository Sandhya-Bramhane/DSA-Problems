class Solution {
    public int maxProfit(int[] prices) {
        
        int BuyPrice = Integer.MAX_VALUE;
        int MaxiProfit = 0;
        int n = prices.length;
        
        for(int i = 0; i < n; i++)
        {
            if(BuyPrice < prices[i])
            {
                int profit = prices[i] - BuyPrice;
                MaxiProfit = Math.max(MaxiProfit,profit);  
            }
            else{
                BuyPrice = prices[i];
            }
        }
        return MaxiProfit;
    }
}