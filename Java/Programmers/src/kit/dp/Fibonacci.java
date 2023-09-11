package kit.dp;

public class Fibonacci {
    public static void main(String[] args) {
        FibonacciSolution solution = new FibonacciSolution();
        System.out.println(solution.solution(5));
    }
}

class FibonacciSolution {
    public int solution(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }
        return dp[n];
    }
}
