import java.io.*;
import java.util.StringTokenizer;

public class BOJ2293 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] coins = new int[n+1];
        int[] dp = new int[k+1];
        dp[0] = 1; //0원 경우의 수는 1가지

        for(int i = 1; i <= n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 0; j <= k; j++) {
                if(coins[i] <= j) {
                    dp[j] += dp[j - coins[i]];
                }
            }
        }

        bw.write(dp[k] + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
