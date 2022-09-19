import java.io.*;
import java.math.BigInteger;

public class BOJ24309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());
        BigInteger c = new BigInteger(br.readLine());
        BigInteger x = b.subtract(c).divide(a);
        bw.write(x.toString());
        bw.flush();
    }
}
