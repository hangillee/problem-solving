import java.io.*;
import java.util.StringTokenizer;

public class BOJ14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] schedules = new int[N+1][2];
        int[] dp = new int[N+1];

        for(int i = 0 ; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            schedules[i][0] = Integer.parseInt(st.nextToken());
            schedules[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++) {
            if(i + schedules[i][0] <= N) {
                dp[i+schedules[i][0]] = Math.max(dp[i + schedules[i][0]], dp[i] + schedules[i][1]);
            }
            dp[i+1] = Math.max(dp[i], dp[i+1]);
        }

        bw.write(String.valueOf(dp[N]));
        bw.flush();
        bw.close();
        br.close();
    }
}
