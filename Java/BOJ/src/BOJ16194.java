import java.io.*;
import java.util.StringTokenizer;

public class BOJ16194 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1]; //i개 카드를 구매했을 때의 최솟값
        int[] cards = new int[N+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = 0;
        dp[1] = cards[1];

        for(int i = 2; i <= N; i++) {
            dp[i] = cards[i];
            for(int j = 1; j < i; j++) {
                dp[i] = Math.min(dp[i - j] + dp[j], dp[i]);
            }
        }
        bw.write(String.valueOf(dp[N]));
        bw.flush();
        bw.close();
        br.close();
    }
}
