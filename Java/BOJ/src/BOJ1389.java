import java.io.*;
import java.util.StringTokenizer;

public class BOJ1389 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] adjMatrix = new int[N+1][N+1];
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                if(i != j) {
                    adjMatrix[i][j] = N*N;
                }
            }
        }
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());
            adjMatrix[row][col] = 1;
            adjMatrix[col][row] = 1;
        }

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                for(int k = 1; k <= N; k++) {
                    if(adjMatrix[j][k] > adjMatrix[j][i] + adjMatrix[i][k]) {
                        adjMatrix[j][k] = adjMatrix[j][i] + adjMatrix[i][k];
                    }
                }
            }
        }

        int result = Integer.MAX_VALUE;
        int idx = 0;
        for(int i = 1; i <= N; i++) {
            int kevinBacon = 0;
            for(int j = 1; j <= N; j++) {
                kevinBacon += adjMatrix[i][j];
            }
            if(result > kevinBacon) {
                result = kevinBacon;
                idx = i;
            }
        }

        bw.write(String.valueOf(idx));
        bw.flush();
        bw.close();
        br.close();
    }
}
