import java.io.*;
import java.util.StringTokenizer;

public class BOJ17388 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        if(S + K + H < 100) {
            if(S < K && S < H) {
                bw.write("Soongsil");
            } else if (K < S && K < H) {
                bw.write("Korea");
            } else if (H < S && H < K) {
                bw.write("Hanyang");
            }
        } else {
            bw.write("OK");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
