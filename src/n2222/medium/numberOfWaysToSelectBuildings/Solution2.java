package n2222.medium.numberOfWaysToSelectBuildings;

public class Solution2 {

    public long numberOfWays(String s) {
        long z = 0, o = 0, zo = 0, oz = 0, zoz = 0, ozo = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                zoz += zo;
                oz += o;
                z++;
            } else {
                ozo += oz;
                zo += z;
                o++;
            }
        }
        return zoz + ozo;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.numberOfWays("10010"));
        System.out.println(solution.numberOfWays("001101"));
        System.out.println(solution.numberOfWays("11100"));
    }
}
