package bestTimeToBuyAndSellStockII;

public class Solution {
    public int maxProfit(int[] prices) {
        int earn = 0;
        if (prices.length < 2) return earn;

        int buyPrise = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (buyPrise < prices[i]) {
                int salePrise = prices[i];

                while (++i < prices.length && prices[i] > salePrise) {
                    salePrise = prices[i];
                }

                earn += salePrise - buyPrise;
                if (i < prices.length) buyPrise = prices[i];
            } else {
                buyPrise = prices[i];
            }
        }

        return earn;
    }
}
