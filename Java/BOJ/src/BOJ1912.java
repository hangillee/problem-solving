import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] dp = new int[n];
        int[] seq = new int[n];

        for(int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = seq[0];

        for(int i = 1; i < n; i++) {
            dp[i] = seq[i];
            dp[i] = Math.max(dp[i-1] + seq[i], dp[i]);
        }

        int max = dp[0];
        for(int i = 0; i < n; i++) {
            max = Math.max(dp[i], max);
        }

        System.out.println(max);
    }
}
