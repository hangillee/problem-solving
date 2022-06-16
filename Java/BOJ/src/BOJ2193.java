import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2193 {
    private static long[] dp = new long[91];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());

        dp[1] = 1L;
        dp[2] = 1L;

        System.out.println(pinary(length));
    }

    public static long pinary(int length) {
        if(length > 2) {
            if(dp[length] == 0) {
                dp[length] = pinary(length - 1) + pinary(length - 2);
                return dp[length];
            } else {
                return dp[length];
            }
        } else {
            return dp[length];
        }
    }
}
