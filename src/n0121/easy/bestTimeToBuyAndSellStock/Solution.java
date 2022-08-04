package n0121.easy.bestTimeToBuyAndSellStock;

class Solution {

    public int maxProfit(int[] prices) {

        if (prices.length < 2) {
            return 0;
        }

        int maxProfit = 0;
        int min = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                for (int j = i + 1; j < prices.length; j++) {
                    if (prices[j] > maxProfit) {
                        maxProfit = prices[j];
                    }
                    if (prices[i] > prices[j]) {
                        return 0;
                    }
                }
            }
        }
        return maxProfit - min;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices01 = {7, 1, 5, 3, 6, 4};
        int[] prices02 = {7, 6, 4, 3, 1};
        int[] prices03 = {1};
        int[] prices04 = {1, 2};
        System.out.println(solution.maxProfit(prices01));
        System.out.println(solution.maxProfit(prices02));
        System.out.println(solution.maxProfit(prices03));
//        System.out.println(solution.maxProfit(prices04));
    }
}