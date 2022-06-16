import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11053 {
    private static int[] dp;
    private static int[] seq;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int seqSize = Integer.parseInt(br.readLine());
        dp = new int[seqSize + 1];
        seq = new int[seqSize];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < seqSize; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        //모든 원소들은 기본적으로 자기 자신의 크기를 가진다.
        for (int i = 0; i < seqSize; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (seq[j] < seq[i] && dp[j] + 1 > dp[i]){
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int max = 0;
        for(int i = 0; i < seqSize; i++) {
            max = Math.max(dp[i], max);
        }
        System.out.println(max);
    }
}