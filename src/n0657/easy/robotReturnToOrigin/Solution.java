package n0657.easy.robotReturnToOrigin;

class Solution {

    public boolean judgeCircle(String moves) {

        int UD = 0;
        int RL = 0;

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                UD++;
            } else if (moves.charAt(i) == 'D') {
                UD--;
            } else if (moves.charAt(i) == 'R') {
                RL++;
            } else if (moves.charAt(i) == 'L') {
                RL--;
            }
        }
        return UD == 0 && RL == 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.judgeCircle("UD"));
        System.out.println(solution.judgeCircle("LL"));
    }
}
