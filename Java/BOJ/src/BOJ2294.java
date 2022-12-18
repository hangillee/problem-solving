import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2294 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] coins = new int[n];

        for(int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[10001];
        Arrays.fill(dp, 10001);
        dp[0] = 0;

        for(int i = 0; i < n; i++) {
            for(int j = coins[i]; j <= k; j++) {
                dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
            }
        }

        if(dp[k] != 10001) {
            bw.write(String.valueOf(dp[k]));
        } else {
            bw.write("-1");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
