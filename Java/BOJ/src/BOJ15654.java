import java.io.*;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ15654 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] numArr;
    static int[] sequence;
    static boolean[] isVisited;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        numArr = new int[N];
        isVisited = new boolean[N];
        sequence = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numArr);
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

        for(int i = 0; i < N; i++) {
            if(!isVisited[i]) {
                isVisited[i] = true;
                sequence[depth] = numArr[i];
                DFS(N, M, depth + 1);
                isVisited[i] = false;
            }
        }
        return;
    }
}
