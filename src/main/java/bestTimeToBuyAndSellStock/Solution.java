package bestTimeToBuyAndSellStock;

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;

        int profit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - minPrice > profit)
                profit = prices[i] - minPrice;

            if (minPrice > prices[i])
                minPrice = prices[i];
        }

        return profit;
    }
}
