package n1678.easy.goalParserInterpretation;

class DfsSolution {

    StringBuilder sb = new StringBuilder();

    public String interpret(String command) {
        dfs(command);
        return sb.toString();
    }

    private void dfs(String command) {
        if (command == null || command.length() == 0) {
            return;
        }

        if (command.substring(0, 1).equals("G")) {
            sb.append("G");
            dfs(command.substring(1));
        } else if (command.length() >= 2 && command.substring(0, 2).equals("()")) {
            sb.append("o");
            dfs(command.substring(2));
        } else if (command.length() >= 4 && command.substring(0, 4).equals("(al)")) {
            sb.append("al");
            dfs(command.substring(4));
        } else {
            sb.append(command.substring(0, 4));
            dfs(command.substring(4));
        }
    }

    public static void main(String[] args) {
        DfsSolution solution = new DfsSolution();
        System.out.println(solution.interpret("G()(al)"));
        System.out.println(solution.interpret("G()()()()(al)"));
        System.out.println(solution.interpret("(al)G(al)()()G"));
    }
}
