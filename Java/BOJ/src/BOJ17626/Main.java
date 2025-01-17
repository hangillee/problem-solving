package BOJ17626;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        int answer = getMinSquares(n);
        bw.write(answer + "");
        bw.flush();
        bw.close();
        br.close();
    }

    static int getMinSquares(int n) {
        for (int i = 2; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                min = Math.min(dp[i - j*j], min);
            }
            dp[i] = min + 1;
        }
        return dp[n];
    }
}
