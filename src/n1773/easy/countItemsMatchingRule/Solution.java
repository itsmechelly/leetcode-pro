package n1773.easy.countItemsMatchingRule;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> item : items) {
            if ("type".equals(ruleKey) && item.get(0).equals(ruleValue)) {
                count++;
            } else if ("color".equals(ruleKey) && item.get(1).equals(ruleValue)) {
                count++;
            } else if ("name".equals(ruleKey) && item.get(2).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        List<List<String>> items01 = new ArrayList<List<String>>();

        List<String> item01 = new ArrayList<String>();
        item01.add("phone");
        item01.add("blue");
        item01.add("pixel");
        items01.add(item01);

        List<String> item02 = new ArrayList<String>();
        item02.add("computer");
        item02.add("silver");
        item02.add("lenovo");
        items01.add(item02);

        List<String> item03 = new ArrayList<String>();
        item03.add("phone");
        item03.add("gold");
        item03.add("iphone");
        items01.add(item03);

        //---

        List<List<String>> items02 = new ArrayList<List<String>>();

        List<String> item04 = new ArrayList<String>();
        item04.add("phone");
        item04.add("blue");
        item04.add("pixel");
        items02.add(item04);

        List<String> item05 = new ArrayList<String>();
        item05.add("computer");
        item05.add("silver");
        item05.add("phone");
        items02.add(item05);

        List<String> item06 = new ArrayList<String>();
        item06.add("phone");
        item06.add("gold");
        item06.add("iphone");
        items02.add(item06);

        //---

        Solution solution = new Solution();

        System.out.println(solution.countMatches(items01, "color", "silver"));
        System.out.println(solution.countMatches(items02, "type", "phone"));
    }
}
