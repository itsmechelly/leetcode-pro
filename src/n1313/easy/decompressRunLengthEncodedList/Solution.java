package n1313.easy.decompressRunLengthEncodedList;

import java.util.*;

public class Solution {

    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[i + 1]);
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums01 = {1, 2, 3, 4};
        int[] nums02 = {1, 1, 2, 3};
        System.out.println(Arrays.toString(solution.decompressRLElist(nums01)));
        System.out.println(Arrays.toString(solution.decompressRLElist(nums02)));
    }
}
