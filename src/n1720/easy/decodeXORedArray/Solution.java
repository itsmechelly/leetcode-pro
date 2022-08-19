package n1720.easy.decodeXORedArray;

import java.util.Arrays;

public class Solution {

    public int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;

        for (int i = 0; i < encoded.length; i++)
            arr[i + 1] = arr[i] ^ encoded[i];
        return arr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] encoded01 = {1, 2, 3};
        int first01 = 1;
        System.out.println(Arrays.toString(solution.decode(encoded01, first01)));

        int[] encoded02 = {6, 2, 7, 3};
        int first02 = 4;
        System.out.println(Arrays.toString(solution.decode(encoded02, first02)));
    }
}
