import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ15656 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] nums;
    static int[] seq;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        nums = new int[N];
        seq = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);

        DFS(N, M, 0);

        bw.flush();
        bw.close();
        br.close();
    }

    private static void DFS(int N, int M, int depth) throws IOException {
        if(depth == M) {
            for(int num : seq) {
                bw.write(num + " ");
            }
            bw.write("\n");
            return;
        }
        for(int i = 0; i < N; i++) {
            seq[depth] = nums[i];
            DFS(N, M, depth + 1);
        }
    }
}
