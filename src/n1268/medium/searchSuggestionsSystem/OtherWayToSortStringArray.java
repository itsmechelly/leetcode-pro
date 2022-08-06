package n1268.medium.searchSuggestionsSystem;

import java.util.Arrays;
import java.util.List;

class OtherWayToSortStringArray {
    public List<String> suggestedProducts(String[] products, String searchWord) {
        for (int i = 0; i < products.length; i++) {
            for (int j = i + 1; j < products.length; j++) {
                if (products[i].compareTo(products[j]) > 0) {
                    String temp = products[i];
                    products[i] = products[j];
                    products[j] = temp;
                }
            }
        }
        return Arrays.asList(products);
    }

    public static void main(String[] args) {
        OtherWayToSortStringArray solution = new OtherWayToSortStringArray();

        String[] products01 = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        String[] products02 = {"havana"};
        String[] products03 = {"bags", "baggage", "banner", "box", "cloths"};

        String searchWord01 = "mouse";
        String searchWord02 = "havana";
        String searchWord03 = "bags";

        System.out.println(solution.suggestedProducts(products01, searchWord01));
        System.out.println(solution.suggestedProducts(products02, searchWord02));
        System.out.println(solution.suggestedProducts(products03, searchWord03));
    }
}
