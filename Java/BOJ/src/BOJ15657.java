import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ15657 {
    static int[] numArr;
    static int[] sequence;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        numArr = new int[N];
        sequence = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numArr);

        DFS(N, M, 0, numArr[0]);

        bw.flush();
        bw.close();
        br.close();
    }

    static void DFS(int N, int M, int depth, int lastValue) throws IOException {
        if(depth == M) {
            for(int i : sequence) {
                bw.write(i + " ");
            }
            bw.write("\n");
            return;
        }

        for(int i = 0; i < N; i++) {
            if(lastValue <= numArr[i]) {
                sequence[depth] = numArr[i];
                DFS(N, M, depth + 1, numArr[i]);
            }
        }

    }
}
