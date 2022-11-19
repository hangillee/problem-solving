import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ22193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger N = new BigInteger(st.nextToken());
        BigInteger M = new BigInteger(st.nextToken());
        BigInteger A = new BigInteger(br.readLine());
        BigInteger B = new BigInteger(br.readLine());

        bw.write(String.valueOf(A.multiply(B)));
        bw.flush();
        bw.close();
        br.close();
    }
}
