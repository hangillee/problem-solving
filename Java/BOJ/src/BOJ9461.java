import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9461 {
    private static long[] dp = new long[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int num;

        dp[0] = 0L;
        dp[1] = 1L;
        dp[2] = 1L;

        for(int i = 0; i < testCase; i++) {
            num = Integer.parseInt(br.readLine());
            System.out.println(padoban(num));
        }
    }

    public static long padoban(int num) {
        if(dp[num] == 0) {
            if(num > 2) {
                dp[num] = padoban(num - 2) + padoban(num - 3);
            }
        }
        return dp[num];
    }
}
