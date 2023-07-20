package kit.sort;

import java.util.Arrays;

public class MakeMinNum {
    public static void main(String[] args) {
        MakeMinNumSolution solution = new MakeMinNumSolution();
        System.out.println(solution.solution(new int[]{ 1, 2 }, new int[]{ 3, 4 }));
    }
}

class MakeMinNumSolution {
    public int solution(int []A, int []B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i < A.length; i++) {
            answer += (A[i] * B[B.length-i-1]);
        }
        return answer;
    }
}
