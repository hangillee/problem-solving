package kit.string;

public class NumericString {
    public static void main(String[] args) {
        NumericStringSolution solution = new NumericStringSolution();
        System.out.println(solution.solution("a234"));
    }
}

class NumericStringSolution {
    public boolean solution(String s) {
        try {
            Integer.parseInt(s);
            return s.length() == 4 || s.length() == 6;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}