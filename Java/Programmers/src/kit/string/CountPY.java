package kit.string;

import java.util.ArrayList;
import java.util.List;

public class CountPY {
    public static void main(String[] args) {
        CountPYSolution solution = new CountPYSolution();
        System.out.println(solution.solution("PPoooYY"));
    }
}

class CountPYSolution {
    boolean solution(String s) {
        List<Character> dequeP = new ArrayList<>();
        List<Character> dequeY = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                dequeP.add(s.charAt(i));
            } else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                dequeY.add(s.charAt(i));
            }
        }
        return dequeP.size() == dequeY.size();
    }
}