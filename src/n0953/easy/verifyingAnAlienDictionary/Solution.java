package n0953.easy.verifyingAnAlienDictionary;

class Solution {

    public boolean isAlienSorted(String[] words, String order) {

        //defined int[]orderMap to convert 'order' to int values
        //the orderMap array contains 26 elements for possible 26 letters
        int[] alphabet = new int[26];

        //running in a loop to convert orderMap array values
        for (int i = 0; i < order.length(); i++) {
            alphabet[order.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                // If we do not find a mismatch letter between words[i] and words[i + 1],
                // we need to examine the case when words are like ("apple", "app")
                if (j >= words[i + 1].length()) {
                    return false;
                }

                if (words[i].charAt(j) != words[i + 1].charAt(j)) {
                    int currentChar = words[i].charAt(j) - 'a';
                    int nextChar = words[i + 1].charAt(j) - 'a';
                    if (alphabet[currentChar] > alphabet[nextChar]) {
                        return false;
                    } else {
                        // if we find the first different letter, and they are sorted,
                        // then there's no need to check remaining letters
                        break;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] words01 = {"hello", "leetcode"};
        String order01 = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.print("01: ");
        System.out.println(solution.isAlienSorted(words01, order01));

        String[] words02 = {"word", "world", "row"};
        String order02 = "worldabcefghijkmnpqstuvxyz";
        System.out.print("02: ");
        System.out.println(solution.isAlienSorted(words02, order02));

        String[] words03 = {"apple", "app"};
        String order03 = "abcdefghijklmnopqrstuvwxyz";
        System.out.print("03: ");
        System.out.println(solution.isAlienSorted(words03, order03));
    }
}