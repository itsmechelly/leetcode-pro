package n0443.medium.stringCompression;

class Solution {

    public int compress(char[] chars) {
        int index = 0;
        int i = 0;

        while (i < chars.length) {
            int j = i;
            while (j < chars.length && chars[j] == chars[i]) {
                j++;
            }
            chars[index++] = chars[i];
            if (j - i > 1) {
                String count = j - i + "";
                for (char c : count.toCharArray()) {
                    chars[index++] = c;
                }
            }
            i = j;
        }
        return index;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(solution.compress(chars1));

        char[] chars2 = {'a'};
        System.out.println(solution.compress(chars2));

        char[] chars3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        System.out.println(solution.compress(chars3));
    }
}
