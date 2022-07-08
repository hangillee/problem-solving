import java.io.*;
import java.util.StringTokenizer;

public class BOJ10819 {
    static int N;
    static int[] A;
    static int[] afterPerm;
    static int max = 0;
    static boolean[] isVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        A = new int[N];
        isVisited = new boolean[N];
        afterPerm = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        permutation(0);
        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void permutation(int depth) {
        if(depth == N) {
            int sum = 0;
            for(int i = 0; i < N-1; i++) {
                sum += Math.abs(afterPerm[i] - afterPerm[i+1]);
            }
            max = Math.max(max, sum);
            return;
        }
        for(int i = 0; i < N; i++) {
            if(!isVisited[i]) {
                isVisited[i] = true;
                afterPerm[depth] = A[i];
                permutation(depth+1);
                isVisited[i] = false;
            }
        }
    }
}
