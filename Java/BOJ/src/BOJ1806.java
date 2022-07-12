import java.io.*;
import java.util.StringTokenizer;

public class BOJ1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] seq = new int[N];
        int min = Integer.MAX_VALUE;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        int i = 0;
        int j = 0;
        int sum = 0;
        while(true) {
            if(sum >= M) {
                sum -= seq[i++];
                min = Math.min(min, (j - i) + 1);
            } else if(j == N) {
                break;
            }
            else {
                sum += seq[j++];
            }
        }

        if(min == Integer.MAX_VALUE) {
            min = 0;
        }
        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
        br.close();
    }
}
