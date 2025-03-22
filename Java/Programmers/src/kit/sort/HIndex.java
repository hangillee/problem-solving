package kit.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HIndex {
    public static void main(String[] args) {
        HIndexSolution solution = new HIndexSolution();
        System.out.println(solution.solution(new int[]{5, 6, 7, 8}) + "");
    }
}

class HIndexSolution {
    public int solution(int[] citations) {
        int answer = 0;

        List<Integer> papers = Arrays.stream(citations)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        for (int i = 0; i < citations.length - 1; i++) {
           if (papers.get(i) <= citations.length - i) {
               answer = citations[i];
               break;
           }
        }

        return answer;
    }
}
