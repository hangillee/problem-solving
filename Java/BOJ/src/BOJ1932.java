import java.io.*;
import java.util.StringTokenizer;

public class BOJ1932 {
    static int[][] triangle;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        triangle = new int[n + 1][n + 1];
        dp = new int[n + 1][n + 1];

        for(int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int index = 1;
            while(st.hasMoreElements()) {
                triangle[i][index] = Integer.parseInt(st.nextToken());
                index++;
            }
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(dp[i-1][j] == 0) {
                    if(triangle[i][j] == 0) {
                        break;
                    }
                    dp[i][j] += triangle[i][j] + dp[i-1][j-1];
                } else {
                    dp[i][j] += (triangle[i][j] + Math.max(dp[i-1][j], dp[i-1][j-1]));
                }
            }
        }

        int max = 0;
        for(int i = 1; i <= n; i++) {
            max = Math.max(max, dp[n][i]);
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();
    }
}
