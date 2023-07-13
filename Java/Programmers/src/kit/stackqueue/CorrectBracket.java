package kit.stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class CorrectBracket {
    public static void main(String[] args) {
        CorrectBracketSolution solution = new CorrectBracketSolution();
        System.out.println(solution.solution("(()())"));
    }
}

class CorrectBracketSolution {
    boolean solution(String s) {
        Deque<String> bracketStack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++) {
            String bracket = s.substring(i, i+1);
            if(bracket.equals("(")) {
                bracketStack.push(bracket);
            } else if(bracket.equals(")") && bracketStack.size() != 0) {
                bracketStack.pop();
            } else {
                return false;
            }
        }
        return bracketStack.isEmpty();
    }
}
