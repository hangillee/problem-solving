import java.io.*;

public class BOJ9655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        dp[0] = 0; //0개를 1개나 3개로 뽑는 횟수는 0번 (0, 0)
        dp[1] = 1; //1개를 1개나 3개로 뽑는 횟수는 1번 (1, 0)
        if(N > 1) {
            dp[2] = 2; //2개를 1개나 3개로 뽑는 횟수는 2번 (1, 1)
        }
        for(int i = 3; i <= N; i++) {
            dp[i] = Math.min(dp[i - 1] + 1, dp[i - 3] + 1);
        }

        if(dp[N] % 2 == 0) {
            bw.write("CY");
        } else {
            bw.write("SK");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
