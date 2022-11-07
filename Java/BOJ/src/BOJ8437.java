import java.io.*;
import java.math.BigInteger;

public class BOJ8437 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger originNumber = new BigInteger(br.readLine());
        BigInteger gap = new BigInteger(br.readLine());

        bw.write((originNumber.add(gap).divide(new BigInteger("2")) + "\n"));
        bw.write(String.valueOf(originNumber.subtract(gap).divide(new BigInteger("2"))));

        bw.flush();
        bw.close();
        br.close();
    }
}
