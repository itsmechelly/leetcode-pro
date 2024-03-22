package n0167.medium.twoSumIIInputArrayIsSorted;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapSolution {

    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> hashMap = new HashMap();

        for (int i = 0; i < numbers.length; i++) {
            if (hashMap.containsKey(target - numbers[i])) {
                res[1] = i + 1;
                res[0] = hashMap.get(target - numbers[i]);
            } else {
                hashMap.put(numbers[i], i + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        HashMapSolution solution = new HashMapSolution();
        int[] nums01 = {2, 7, 11, 15};
        int[] nums02 = {2, 3, 4};
        int[] nums03 = {-1, 0};
        System.out.println(Arrays.toString(solution.twoSum(nums01, 9)));
        System.out.println(Arrays.toString(solution.twoSum(nums02, 6)));
        System.out.println(Arrays.toString(solution.twoSum(nums03, -1)));
    }
}
