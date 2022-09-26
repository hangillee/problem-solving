import java.io.*;
import java.util.StringTokenizer;

public class BOJ1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] colorValues = new int[N+1][N+1];
        for(int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 3; j++) {
                colorValues[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] dp = new int[N+1][N+1];
        for(int i = 1; i <= N; i++) {
            dp[i][1] = Math.min(dp[i-1][2], dp[i-1][3]) + colorValues[i][1];
            dp[i][2] = Math.min(dp[i-1][1], dp[i-1][3]) + colorValues[i][2];
            dp[i][3] = Math.min(dp[i-1][1], dp[i-1][2]) + colorValues[i][3];
        }

        int minimum = Math.min(dp[N][1], Math.min(dp[N][2], dp[N][3]));
        bw.write(String.valueOf(minimum));
        bw.flush();
    }
}
