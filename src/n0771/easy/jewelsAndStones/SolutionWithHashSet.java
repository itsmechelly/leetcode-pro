package n0771.easy.jewelsAndStones;

import java.util.HashSet;

class SolutionWithHashSet {

    public int numJewelsInStones(String jewels, String stones) {
        int res = 0;
        HashSet<Character> hashSet = new HashSet<Character>();
        for (char c : jewels.toCharArray()) {
            hashSet.add(c);
        }
        for (char c : stones.toCharArray()) {
            if (hashSet.contains(c)) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        SolutionWithHashSet solution = new SolutionWithHashSet();
        System.out.println(solution.numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(solution.numJewelsInStones("z", "ZZ"));
    }
}
