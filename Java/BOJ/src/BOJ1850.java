import java.io.*;
import java.util.StringTokenizer;

public class BOJ1850 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long result = euclidean(A, B);

        for(int i = 0; i < result; i++) {
            sb.append(1);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static long euclidean(long A, long B) {
        long R = 0;
        while(B != 0) {
            R = A % B;
            A = B;
            B = R;
        }
        return A;
    }
}
