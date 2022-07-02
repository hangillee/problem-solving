import java.io.*;
import java.util.StringTokenizer;

public class BOJ7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] physical = new int[N][2];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            physical[i][0] = Integer.parseInt(st.nextToken());
            physical[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] rank = new int[N];
        for(int i = 0; i < N; i++) {
            rank[i] = 1;
            for(int j = 0; j < N; j++) {
                if(physical[i][0] < physical[j][0] && physical[i][1] < physical[j][1]) {
                    rank[i]++;
                }
            }
            bw.write(rank[i] + " ");
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
