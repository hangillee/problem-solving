import java.io.*;
import java.util.StringTokenizer;

public class BOJ26082 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int result = (B / A) * C * 3;
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
