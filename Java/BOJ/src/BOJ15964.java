import java.io.*;
import java.util.StringTokenizer;

public class BOJ15964 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long result = (A*A) - (B*B);
        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
