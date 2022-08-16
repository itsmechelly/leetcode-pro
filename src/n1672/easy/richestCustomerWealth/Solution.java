package n1672.easy.richestCustomerWealth;

public class Solution {

    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            max = Math.max(max, wealth);
            wealth = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums01 = {{1, 2, 3}, {3, 2, 1}};
        int[][] nums02 = {{1, 5}, {7, 3}, {3, 5}};
        int[][] nums03 = {{2, 7, 8}, {7, 1, 3}, {1, 9, 5}};
        System.out.println(solution.maximumWealth(nums01));
        System.out.println(solution.maximumWealth(nums02));
        System.out.println(solution.maximumWealth(nums03));
    }
}
