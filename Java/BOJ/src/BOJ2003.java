import java.io.*;
import java.util.StringTokenizer;

public class BOJ2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] seq = new int[N];
        int sum;
        int count = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++) {
            sum = 0;
            for(int j = i; j < N; j++) {
                sum += seq[j];
                if(M < sum) {
                    break;
                } else if(M > sum) {
                    continue;
                } else {
                    count++;
                    break;
                }
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
