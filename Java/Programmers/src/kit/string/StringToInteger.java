package kit.string;

public class StringToInteger {
    public static void main(String[] args) {
        StringToIntegerSolution solution = new StringToIntegerSolution();
        System.out.println(solution.solution("-1234"));
    }
}

class StringToIntegerSolution {
    public int solution(String s) {
        return Integer.parseInt(s);
    }
}