package kit.sort;

import java.util.Arrays;
import java.util.Comparator;

public class StringDescSort {
    public static void main(String[] args) {
        StringDescSortSolution solution = new StringDescSortSolution();
        System.out.println(solution.solution("Zbcdefg"));
    }
}

class StringDescSortSolution {
    public String solution(String s) {
        Character[] charArr = s.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        Arrays.sort(charArr, Comparator.reverseOrder());
        StringBuilder stringBuilder = new StringBuilder();
        for(Character c : charArr) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}