package n0122.medium.bestTimeToBuyAndSellStockII;

public class Solution {

    public int maxProfit(int[] prices) {

        if (prices == null || prices.length == 0) {
            return 0;
        }

        int profit = 0;
        for (int i = 0; i < prices.length -1 ; i++) {
            if (prices[i+1] > prices[i]) {
                profit+= prices[i + 1] - prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices01 = {7, 1, 5, 3, 6, 4};
        int[] prices02 = {1, 2, 3, 4, 5};
        int[] prices03 = {7, 6, 4, 3, 1};
        System.out.println(solution.maxProfit(prices01));
        System.out.println(solution.maxProfit(prices02));
        System.out.println(solution.maxProfit(prices03));
    }

}
