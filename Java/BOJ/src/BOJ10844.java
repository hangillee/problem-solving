import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10844 {
    private static long[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        dp = new long[num + 1][10];

        for(int i = 0; i < 10; i++) {
            dp[1][i] = 1L;
        }

        long result = 0;

        for(int i = 1; i <= 9; i++) {
            result += stairNum(num, i);
        }

        System.out.println(result % 1000000000);
    }
    public static long stairNum(int num, int digit) {
        if(num == 1) {
            return dp[num][digit];
        }
        if(dp[num][digit] == 0) {
            if (digit == 0) {
                dp[num][digit] = stairNum(num - 1, 1);
            } else if (digit == 9) {
                dp[num][digit] = stairNum(num - 1, 8);
            } else {
                dp[num][digit] = stairNum(num - 1, digit - 1) + stairNum(num - 1, digit + 1);
            }
        }
        return dp[num][digit] % 1000000000;
    }
}
