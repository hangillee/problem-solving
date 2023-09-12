package kit.stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class PairDelete {
    public static void main(String[] args) {
        PairDeleteSolution solution = new PairDeleteSolution();
        System.out.println(solution.solution("abab"));
    }
}

class PairDeleteSolution {
    public int solution(String s) {
        Deque<String> stringStack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++) {
            if (!stringStack.isEmpty() && stringStack.peek().equals(String.valueOf(s.charAt(i)))) {
                stringStack.pop();
            } else {
                stringStack.push(String.valueOf(s.charAt(i)));
            }
        }
        return stringStack.size() == 0 ? 1 : 0;
    }
}