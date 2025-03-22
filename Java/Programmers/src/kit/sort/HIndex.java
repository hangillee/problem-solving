package kit.sort;

import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) {
        HIndexSolution solution = new HIndexSolution();
        System.out.println(solution.solution(new int[]{3, 0, 6, 1, 5}) + "");
    }
}

class HIndexSolution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for (int i = 0; i <= citations.length - 1; i++) {
           if (citations[i] >= citations.length - i) {
               answer = citations.length - i;
               break;
           }
        }

        return answer;
    }
}
