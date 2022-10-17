import java.io.*;
import java.util.StringTokenizer;

public class BOJ18301 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int n12 = Integer.parseInt(st.nextToken());

        int N = (((n1 + 1) * (n2 + 1)) / (n12 + 1)) - 1;
        bw.write(String.valueOf(N));
        bw.flush();
        bw.close();
        br.close();
    }
}
