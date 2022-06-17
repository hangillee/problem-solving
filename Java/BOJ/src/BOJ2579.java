import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2579 {
    private static Integer[] dp;
    private static int[] stair;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        dp = new Integer[num+1];
        stair = new int[num+1];

        for(int i = 1; i <= num; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = stair[0];
        dp[1] = stair[1];
        if(num >= 2) {
            dp[2] = stair[1] + stair[2];
        }

        System.out.println(climbStair(num));
    }

    public static int climbStair(int num) {
        if(dp[num] == null) {
            dp[num] = Math.max(climbStair(num - 3) + stair[num - 1], climbStair(num - 2)) + stair[num];
        }
        return dp[num];
    }
}
