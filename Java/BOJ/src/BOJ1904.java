import java.io.*;

public class BOJ1904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= N; i++) {
            dp[i] = (dp[i-2] + dp[i-1]) % 15746;
        }

        bw.write(String.valueOf(dp[N]));
        bw.close();
        br.close();
    }
}
