import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9095 {
    private static int[] dp = new int[12];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 0; i < testCase; i++) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(sum(num));
        }
    }

    public static int sum(int num) {
        if(num > 2) {
            dp[num] = sum(num - 1) + sum(num - 2) + sum(num - 3);
            return dp[num];
        } else {
            return dp[num];
        }
    }
}
