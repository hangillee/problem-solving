import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1463 {
    private static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int targetNum = Integer.parseInt(br.readLine());
        dp = new int[targetNum+1];

        System.out.println(makeOne(targetNum));

    }
    public static int makeOne(int num) {
        if(num == 1) {
            return 0;
        }
        if (dp[num] == 0) {
            if(num % 6 == 0) {
                dp[num] = Math.min(makeOne(num / 3) + 1, makeOne(num / 2) + 1);
                return dp[num] = Math.min(dp[num], makeOne(num - 1) + 1);
            } else if(num % 3 == 0) {
                return dp[num] = Math.min(makeOne(num / 3) + 1, makeOne(num - 1) + 1);
            } else if(num % 2 == 0) {
                return dp[num] = Math.min(makeOne(num / 2) + 1, makeOne(num - 1) + 1);
            }
            return dp[num] = makeOne(num - 1) + 1;
        } else {
            return dp[num];
        }
    }
}
