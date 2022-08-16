package n1678.easy.goalParserInterpretation;

class RegexSolution {

    public String interpret(String command) {
        return command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)", "al");
    }

    public static void main(String[] args) {
        RegexSolution solution = new RegexSolution();
        System.out.println(solution.interpret("G()(al)"));
        System.out.println(solution.interpret("G()()()()(al)"));
        System.out.println(solution.interpret("(al)G(al)()()G"));
    }
}
