import java.io.*;

public class BOJ2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[][] apt = new int[k+1][n+1];

            for(int j = 0; j <= n; j++) {
                apt[0][j] = j;
            }
            for(int j = 1; j <= k; j++) {
                for(int l = 1; l <= n; l++) {
                    apt[j][l] = apt[j - 1][l] + apt[j][l - 1];
                }
            }
            bw.write(apt[k][n] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
