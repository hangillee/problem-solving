import java.io.*;
import java.util.StringTokenizer;

public class BOJ1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        long result = power(A, B, C);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }

    static long power(int A, int B, int C) {
        if(B == 0) {
            return 1;
        }
        if(B == 1) {
            return A % C;
        } else if(B % 2 == 0) {
            long result = power(A, B/2, C);
            return (result * result) % C;
        } else {
            long result = power(A, (B-1)/2, C);
            return (((result * result) % C) * A) % C;
        }
    }
}
