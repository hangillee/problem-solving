package kit.math;

import java.util.Arrays;

public class XTermNNum {
    public static void main(String[] args) {
        XTermNNumSolution solution = new XTermNNumSolution();
        System.out.println(Arrays.toString(solution.solution(10000000, 1000)));
    }
}

class XTermNNumSolution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        for(int i = 1; i < n; i++) {
            answer[i] = answer[i-1] + x;
        }
        return answer;
    }
}