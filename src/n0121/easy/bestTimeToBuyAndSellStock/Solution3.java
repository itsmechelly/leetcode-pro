package n0121.easy.bestTimeToBuyAndSellStock;

class Solution3 {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int[] profit = new int[prices.length];
        for (int i = 1; i < prices.length; i++) {
            profit[i] = prices[i] - prices[i - 1];
        }

        // find maximum subarray
        int max = profit[0]; // profit[0]==1
        int sum = profit[0];
        for (int i = 1; i < profit.length; i++) {
            sum = sum + profit[i];
            max = Math.max(max, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        return max;

    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        int[] prices01 = {7, 1, 5, 3, 6, 4};
        int[] prices02 = {7, 6, 4, 3, 1};
        int[] prices03 = {1};
        int[] prices04 = {1, 2};
        System.out.println(solution.maxProfit(prices01));
        System.out.println(solution.maxProfit(prices02));
        System.out.println(solution.maxProfit(prices03));
        System.out.println(solution.maxProfit(prices04));
    }
}