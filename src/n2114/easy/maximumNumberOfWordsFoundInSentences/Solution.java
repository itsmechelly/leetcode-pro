package n2114.easy.maximumNumberOfWordsFoundInSentences;

class Solution {

    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s : sentences) {
            int count = s.split(" ").length;
            max = Math.max(max, count);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] sentences01 = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        String[] sentences02 = {"please wait", "continue to fight", "continue to win"};
        System.out.println(solution.mostWordsFound(sentences01));
        System.out.println(solution.mostWordsFound(sentences02));
    }
}
