package n1108.easy.defanginganIPAddress;

public class Solution {

    public String defangIPaddr(String address) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char current = address.charAt(i);
            if (current == '.') {
                result.append("[.]");
            } else {
                result.append(current);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String string1 = "1.1.1.1";
        System.out.println(solution.defangIPaddr(string1));

        String string2 = "255.100.50.0";
        System.out.println(solution.defangIPaddr(string2));
    }
}
