import java.io.*;
import java.math.BigInteger;

public class BOJ26711 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BigInteger A = new BigInteger(br.readLine());
        BigInteger B = new BigInteger(br.readLine());

        bw.write(String.valueOf(A.add(B)));
        bw.flush();
        bw.close();
        br.close();
    }
}