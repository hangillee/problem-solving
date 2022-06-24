import java.io.*;
import java.util.StringTokenizer;

public class BOJ11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        while(N >= 1) {
            if(N % B > 9) {
                sb.append((char)((N % B) + 55));
            } else {
                sb.append(N % B);
            }
            N /= B;
        }

        bw.write(sb.reverse().toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
