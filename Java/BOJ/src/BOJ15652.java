import java.io.*;
import java.util.StringTokenizer;

public class BOJ15652 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] sequence;
    static int lastNum = 0;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        sequence = new int[M];
        DFS(N, M, 0);
        bw.flush();
        bw.close();
        br.close();
    }

    static void DFS(int N, int M, int depth) throws IOException {
        if(depth == M) {
            for(int num : sequence) {
                bw.write(num + " ");
            }
            bw.write("\n");
            return;
        }

        for(int i = 1; i <= N; i++) {
            if(lastNum <= i) {
                lastNum = i;
                sequence[depth] = i;
                DFS(N, M, depth + 1);
                lastNum = 0;
            }
        }
    }
}
