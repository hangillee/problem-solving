import java.io.*;
import java.util.StringTokenizer;

public class BOJ11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long sum = 0;
        for(int i = 0; i < 3; i++) {
            sum += Long.parseLong(st.nextToken());
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}
