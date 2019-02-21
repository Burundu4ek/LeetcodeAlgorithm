package bestTimeToBuyAndSellStockII;

public class BetterSolution {
    public int maxProfit(int[] prices) {
        int res = 0;
        if (prices == null || prices.length < 2) return res;

        for (int i = 0; i < prices.length; i++) {
            if (i > 0 && prices[i] > prices[i - 1])
                res += prices[i] - prices[i - 1];
        }

        return res;
    }
}
