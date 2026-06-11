class Solution {
    public int maxProfit(int[] prices) {
        int i = 0, j = 1;
        int profit = 0, maxP = 0;

        while (j < prices.length) {
            if (prices[i] < prices[j]) {
                profit = prices[j] - prices[i];
                maxP = Math.max(profit, maxP);
            } else i = j;
            j++;

        }

        return maxP;
    }
}
