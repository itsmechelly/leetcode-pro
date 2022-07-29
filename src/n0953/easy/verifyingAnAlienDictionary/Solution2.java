package n0953.easy.verifyingAnAlienDictionary;

class Solution2 {

    public boolean isAlienSorted(String[] words, String order) {

        //defined int[]orderMap to convert 'order' to int values
        //the orderMap array contains 26 elements for possible 26 letters
        int[] alphabet = new int[26];

        //running in a loop to convert orderMap array values
        for (int i = 0; i < order.length(); i++) {
            alphabet[order.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                int min = Math.min(words[i].length(), words[j].length());
                for (int k = 0; k < min; k++) {
                    char iChar = words[i].charAt(k);
                    char jChar = words[j].charAt(k);
                    if (alphabet[iChar - 'a'] < alphabet[jChar - 'a']) {
                        break;
                    } else if (alphabet[jChar - 'a'] < alphabet[iChar - 'a']) {
                        return false;
                    } else if (k == min - 1 && words[i].length() > words[j].length()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();

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