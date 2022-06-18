import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2133 {
    private static int[] dp = new int[31];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 3;
        System.out.println(tile(n));
    }

    public static int tile(int n) {
        if(dp[n] == 0) {
            if(n > 3 && n % 2 == 0) {
                dp[n] = tile(n-2) * 3 + 2;
                for(int i = n-4; i >= 0; i -= 2) {
                    dp[n] += tile(i) * 2;
                }
            }
        }
        return dp[n];
    }
}
