import java.io.*;
import java.util.StringTokenizer;

public class BOJ15649 {
    static int[] sequence;
    static boolean[] isVisited;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        sequence = new int[M];
        isVisited = new boolean[N+1];
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
            if(!isVisited[i]) {
                isVisited[i] = true;
                sequence[depth] = i;
                DFS(N, M, depth + 1);
                isVisited[i] = false;
            }
        }
        return;
    }
}
