import java.io.*;

public class BOJ24416 {
    static int recursiveCount = 0;
    static int dpCount = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        fiboRecursive(n);
        fiboDP(n);
        bw.write(recursiveCount + " " + dpCount);
        bw.flush();
        bw.close();
        br.close();
    }

    static int fiboRecursive(int n) {
        if(n == 1 || n == 2) {
            recursiveCount++;
            return 1;
        } else {
            return fiboRecursive(n - 1) + fiboRecursive(n - 2);
        }
    }

    static int fiboDP(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 1;
        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            dpCount++;
        }
        return dp[n];
    }
}
