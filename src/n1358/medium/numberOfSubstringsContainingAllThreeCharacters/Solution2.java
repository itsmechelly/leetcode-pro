package n1358.medium.numberOfSubstringsContainingAllThreeCharacters;

class Solution2 {

    public int numberOfSubstrings(String s) {

        int start = 0, end = 0, number = 0;
        int[] nums = new int[3];

        while (end < s.length()) {
            nums[s.charAt(end++) - 'a']++;
            while (nums[0] > 0 && nums[1] > 0 && nums[2] > 0) {
                nums[s.charAt(start++) - 'a']--;
            }
            number += start;
        }
        return number;
    }

    public static void main(String[] args) {
        String s = "aaacb";
        Solution2 solution = new Solution2();
        System.out.println(solution.numberOfSubstrings(s));;
    }
}