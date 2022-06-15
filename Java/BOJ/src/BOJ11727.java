import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11727 {
    private static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        dp = new int[1001];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 3;

        System.out.println(area(num));
    }

    public static int area(int num) {
        if(num > 2) {
            if(dp[num] == 0) {
                dp[num] = area(num - 1) + (2 * area(num - 2));
                return dp[num] % 10007;
            } else {
                return dp[num] % 10007;
            }
        } else {
            return dp[num] % 10007;
        }
    }
}
