package n1108.easy.defanginganIPAddress;

public class Solution2 {

    public String defangIPaddr(String address) {

        String ans = "";
        for (char c : address.toCharArray()) {
            if (c == '.') {
                ans += "[.]";
            } else {
                ans += c;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        String string1 = "1.1.1.1";
        System.out.println(solution.defangIPaddr(string1));

        String string2 = "255.100.50.0";
        System.out.println(solution.defangIPaddr(string2));
    }
}
