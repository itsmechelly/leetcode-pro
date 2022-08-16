package n2194.easy.cellsInARangeOnAnExcelSheet;

import java.util.*;

public class Solution {

    public List<String> cellsInRange(String s) {
        List<String> cells = new ArrayList<>();
        for (char column = s.charAt(0); column <= s.charAt(3); column++) {
            for (char row = s.charAt(1); row <= s.charAt(4); row++) {
                cells.add("" + column + row);
            }
        }
        return cells;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.cellsInRange("K1:L2"));
        System.out.println(solution.cellsInRange("A1:F1"));
    }
}
