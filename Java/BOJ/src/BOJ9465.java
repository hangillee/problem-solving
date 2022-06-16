import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ9465 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++) {
            int length = Integer.parseInt(br.readLine());
            int[][] data = new int[2][length+1];
            int[][] dp = new int[2][length+1];

            for(int j = 0; j < 2; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int k = 1; k <= length; k++) {
                    data[j][k] = Integer.parseInt(st.nextToken(" "));
                }
            }
            dp[0][1] = data[0][1];
            dp[1][1] = data[1][1];

            for(int j = 2; j <= length; j++) {
                dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + data[0][j];
                dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + data[1][j];
            }
            System.out.println(Math.max(dp[0][length], dp[1][length]));
        }
    }
}
