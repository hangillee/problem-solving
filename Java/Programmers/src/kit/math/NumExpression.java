package kit.math;

public class NumExpression {
    public static void main(String[] args) {
        NumExpressionSolution solution = new NumExpressionSolution();
        System.out.println(solution.solution(15));
    }
}

class NumExpressionSolution {
    public int solution(int n) {
        int answer = 0;
        int temp = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = i; j <= n; j++) {
                if(temp < n) temp += j;
                else break;
            }
            if(temp == n) answer++;
            temp = 0;
        }
        return answer;
    }
}