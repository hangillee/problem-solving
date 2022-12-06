import java.io.*;
import java.util.StringTokenizer;

public class BOJ10942 {
    static boolean[][] dp;
    static int[] numArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] numArr = new int[N+1];
        dp = new boolean[N+1][N+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i <= N; i++) {
            dp[i][i] = true;
        }

        for(int i = 1; i <= N-1; i++) {
            if(numArr[i] == numArr[i+1]) {
                dp[i][i+1] = true;
            }
        }

        for(int i = 2; i < N; i++) {
            for(int j = 1; j <= N-i; j++) {
                if(numArr[j] == numArr[j+i] && dp[j+1][j+i-1]){
                    dp[j][j+i] = true;
                }
            }
        }

        int M = Integer.parseInt(br.readLine());
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            if(dp[start][end]) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
