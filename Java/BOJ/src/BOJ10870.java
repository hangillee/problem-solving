import java.io.*;

public class BOJ10870 {
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        dp = new int[21];
        dp[0] = 0;
        dp[1] = 1;

        int num = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(fibonacci(num)));
        bw.flush();
        bw.close();
        br.close();
    }

    static int fibonacci(int num) {
        if(num < 2) {
            return dp[num];
        }
        if(dp[num] != 0) {
            return dp[num];
        }

        dp[num] = fibonacci(num - 1) + fibonacci(num - 2);
        return dp[num];
    }
}
