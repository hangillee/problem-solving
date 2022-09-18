import java.io.*;
import java.util.StringTokenizer;

public class BOJ16430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int P = B - A;

        bw.write(P + " " + B);
        bw.flush();
        bw.close();
        br.close();
    }
}
