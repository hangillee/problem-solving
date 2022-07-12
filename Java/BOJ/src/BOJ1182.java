import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1182 {
    static int N, S;
    static int[] seq;
    static boolean[] isVisited;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        seq = new int[N];
        isVisited = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        DFS(0, 0);

        if(S == 0) {
            count--;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void DFS(int depth, int sum) {
        if(depth == N) {
            if(sum == S) {
                count++;
            }
            return;
        }

        DFS(depth+1, sum + seq[depth]);
        DFS(depth+1, sum);

    }
}
