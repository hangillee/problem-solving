import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ13277 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());
        BigInteger result = A.multiply(B);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
