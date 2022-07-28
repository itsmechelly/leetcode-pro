package n1108.easy.defanginganIPAddress;

public class Solution3 {

    public String defangIPaddr(String address) {
        address = address.replaceAll("\\.", "[\\.]");
        return address;
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();

        String string1 = "1.1.1.1";
        System.out.println(solution.defangIPaddr(string1));

        String string2 = "255.100.50.0";
        System.out.println(solution.defangIPaddr(string2));
    }
}
