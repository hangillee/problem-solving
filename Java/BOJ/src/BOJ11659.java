import java.io.*;
import java.util.StringTokenizer;

public class BOJ11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] num = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int[] prefixsum = new int[N+1];
        for(int i = 1; i <= N; i++) {
            prefixsum[i] = prefixsum[i - 1] + num[i];
        }

        int result = 0;
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            result = prefixsum[end] - prefixsum[start-1];
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
