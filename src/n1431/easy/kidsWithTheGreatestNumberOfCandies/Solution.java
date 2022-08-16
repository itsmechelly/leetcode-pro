package n1431.easy.kidsWithTheGreatestNumberOfCandies;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        int max = candies[0];

        for (int candy : candies) {
            max = Math.max(candy, max);
        }
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums01 = {2, 3, 5, 1, 3};
        int[] nums02 = {4, 2, 1, 1, 2};
        int[] nums03 = {12, 1, 12};
        System.out.println(solution.kidsWithCandies(nums01, 3));
        System.out.println(solution.kidsWithCandies(nums02, 1));
        System.out.println(solution.kidsWithCandies(nums03, 10));
    }
}
