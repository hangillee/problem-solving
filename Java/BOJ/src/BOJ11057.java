import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11057 {
    private static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());

        dp = new int[length + 1][11];

        for(int i = 0; i <= 9; i++) {
            dp[1][i] = 1;
        }

        int result = 0;

        for(int i = 0; i <= 9; i++) {
            result += inclineNum(length, i);
        }

        System.out.println(result % 10007);
    }

    public static int inclineNum(int length, int digit) {
        if(length == 1) {
            return dp[length][digit];
        }
        if(dp[length][digit] == 0) {
            if(digit == 0) {
                dp[length][digit] = inclineNum(length - 1, digit);
            } else {
                dp[length][digit] = inclineNum(length, digit - 1) + inclineNum(length - 1, digit);
            }
        }
        return dp[length][digit] % 10007;
    }
}
