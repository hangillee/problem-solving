package kit.math;

public class BetweenSum {
    public static void main(String[] args) {
        BetweenSumSolution solution = new BetweenSumSolution();
        System.out.println(solution.solution(10, 1));
    }
}

class BetweenSumSolution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a > b) {
            for(int i = b; i <= a; i++) {
                answer += i;
            }
        } else if (a < b) {
            for(int i = a; i <= b; i++) {
                answer += i;
            }
        } else {
            return a;
        }
        return answer;
    }
}