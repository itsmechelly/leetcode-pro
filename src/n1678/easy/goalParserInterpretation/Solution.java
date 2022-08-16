package n1678.easy.goalParserInterpretation;

class Solution {

    public String interpret(String command) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                stringBuilder.append('G');
            }
            if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    stringBuilder.append('o');
                } else stringBuilder.append("al");

            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.interpret("G()(al)"));
        System.out.println(solution.interpret("G()()()()(al)"));
        System.out.println(solution.interpret("(al)G(al)()()G"));
    }
}
