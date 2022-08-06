package n1268.medium.searchSuggestionsSystem.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolutionWithBinarySearch {

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> result = new ArrayList<>();

        int startPosition = 0;
        int n = products.length;
        int binarySearchStart = 0;
        String prefix = new String();

        for (char c : searchWord.toCharArray()) {
            prefix += c;

            // get the starting index of word starting with `prefix`
            startPosition = lower_bound(products, binarySearchStart, prefix);

            // add empty vector to result
            result.add(new ArrayList<>());

            // add the words with the same prefix to the result
            // loop runs until `i` reaches the end of input
            // or 3 times
            // or till the prefix is same for `products[i]`
            // whichever comes first
            for (int i = startPosition; i < Math.min(startPosition + 3, n); i++) {
                if (products[i].length() < prefix.length() || !products[i].substring(0, prefix.length()).equals(prefix)) {
                    break;
                }
                result.get(result.size() - 1).add(products[i]);
            }

            // reduce the size of elements to binary search on since we know
            binarySearchStart = Math.abs(startPosition);
        }
        return result;
    }

    // equivalent code for lower_bound in Java
    int lower_bound(String[] products, int start, String word) {
        int mid;
        int i = start;
        int j = products.length;

        while (i < j) {
            mid = (i + j) / 2;
            if (products[mid].compareTo(word) >= 0) {
                j = mid;
            } else {
                i = mid + 1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        SolutionWithBinarySearch solution = new SolutionWithBinarySearch();

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
