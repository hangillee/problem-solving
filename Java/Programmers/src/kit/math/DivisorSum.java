package kit.math;

public class DivisorSum {
    public static void main(String[] args) {
        DivisorSumSolution solution = new DivisorSumSolution();
        System.out.println(solution.solution(12));
    }
}

class DivisorSumSolution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) answer += i;
        }
        return answer;
    }
}