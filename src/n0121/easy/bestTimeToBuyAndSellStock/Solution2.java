package n0121.easy.bestTimeToBuyAndSellStock;

class Solution2 {

    public int maxProfit(int[] prices) {
        int res = 0;
        int buy = Integer.MAX_VALUE;

        for (int price : prices) {
            buy = Math.min(buy, price);
            res = Math.max(res, price - buy);
//                // also working
//                res = Math.max(res, price - buy);
//                buy = Math.min(buy, price);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
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