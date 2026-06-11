class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxP = 0;

        for (int i = 0; i < prices.length; i++) {
            minBuy = Math.min(prices[i], minBuy);

            maxP = Math.max(prices[i] - minBuy, maxP);
        }

        return maxP;
    }
}
