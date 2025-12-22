class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minBuyPrice = prices[0];

        for(int currentPrice : prices){
            maxProfit = Math.max(maxProfit, currentPrice - minBuyPrice);
            minBuyPrice = Math.min(minBuyPrice, currentPrice);
        }
        return maxProfit;
    }
}