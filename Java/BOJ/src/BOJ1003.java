import java.io.*;
import java.util.Arrays;

public class BOJ1003 {
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        dp = new int[41][2];
        dp[0][0] = 1; //fibonacci(0)일 때 0은 1회 호출
        dp[0][1] = 0; //fibonacci(0)일 때 1은 0회 호출
        dp[1][0] = 0; //fibonacci(1)일 때 0은 0회 호출
        dp[1][1] = 1; //fibonacci(1)일 때 1은 1회 호출
        for(int i = 2; i < 41; i++) {
            dp[i][0] = dp[i - 2][0] + dp[i - 1][0];
            dp[i][1] = dp[i - 2][1] + dp[i - 1][1];
        }

        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            bw.write(dp[N][0] + " " + dp[N][1] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
