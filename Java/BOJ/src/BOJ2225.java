import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2225 {
    private static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //N까지
        int k = Integer.parseInt(st.nextToken()); //K개의 정수

        //K개의 정수를 사용할 때 정수 N을 합의 형태로 나타낼 수 있는 경우의 수
        dp = new int[k + 1][n + 1];

        //1개의 정수를 사용하면 모든 정수의 경우의 수는 자기 자신 1개 뿐이다.
        Arrays.fill(dp[1], 1);
        //각 정수의 갯수마다 0은 0의 합들로만 구성된다. 즉, 경우의 수는 모두 1개다.
        for (int i = 1; i <= k; i++) {
            dp[i][0] = 1;
        }

        for(int i = 2; i <= k; i++) {
            for(int j = 1; j <= n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
                dp[i][j] %= 1000000000;
            }
        }
        System.out.println(dp[k][n]);
    }
}
