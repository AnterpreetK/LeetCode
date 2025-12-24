class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minBuy = prices[0];

        for(int i : prices){
            maxProfit = Math.max(maxProfit, i-minBuy);
            minBuy = Math.min(minBuy, i);
        }
        return maxProfit;
    }
}