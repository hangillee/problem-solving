import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11052 {
    private static int[] dp;
    private static int[] pack;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        pack = new int[num+1];
        for(int i = 1; i <= num; i++) {
            pack[i] = Integer.parseInt(st.nextToken());
        }

        dp = new int[num+1];
        dp[0] = 0;
        dp[1] = pack[1];

        for(int i = 2; i <= num; i++) {
            dp[i] = pack[i];
            for(int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i - j] + dp[j], dp[i]);
            }
        }

        System.out.println(dp[num]);
    }
}
