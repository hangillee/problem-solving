import java.io.*;

public class BOJ9251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String firstStr = br.readLine();
        String secondStr = br.readLine();

        int[][] dp = new int[firstStr.length() + 1][secondStr.length() + 1];
        for(int i = 1; i < dp.length; i++) {
            for(int j = 1; j < dp[i].length; j++) {
                if(firstStr.charAt(i-1) == secondStr.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        bw.write(String.valueOf(dp[firstStr.length()][secondStr.length()]));
        bw.flush();
        bw.close();
        br.close();
    }
}
