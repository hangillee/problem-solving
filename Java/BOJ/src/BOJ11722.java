import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11722 {
    private static int[] dp;
    private static int[] seq;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int seqSize = Integer.parseInt(br.readLine());
        dp = new int[seqSize];
        seq = new int[seqSize];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < seqSize; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < seqSize; i++) {
            dp[i] = 1;
            for(int j = 0; j < seqSize; j++) {
                if(seq[i] < seq[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int max = dp[0];
        for(int i = 1; i < seqSize; i++){
            max = Math.max(dp[i], max);
        }

        System.out.println(max);
    }
}
