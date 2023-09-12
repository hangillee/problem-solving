import java.io.*;

public class BOJ10974 {
    static BufferedReader br;
    static BufferedWriter bw;
    static int N;
    static boolean[] isVisited;
    static int[] permutation;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        isVisited = new boolean[N];
        permutation = new int[N];
        dfs(0);
        bw.flush();
        bw.close();
        br.close();
    }

    public static void dfs(int count) throws IOException {
        if(count == N) {
            for(int i = 0; i < N; i++) {
                bw.write(permutation[i] + " ");
            }
            bw.write("\n");
            return;
        }
        for(int i = 0; i < N; i++) {
            if(!isVisited[i]) {
                permutation[count] = i + 1;
                isVisited[i] = true;
                dfs(count + 1);
                isVisited[i] = false;
            }
        }
    }
}
