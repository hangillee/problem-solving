import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ2407 {
    static BigInteger[] factorials;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        factorials = new BigInteger[n+1];
        factorials[0] = new BigInteger("1");
        BigInteger combination = getFactorials(n).divide(getFactorials(m).multiply(getFactorials(n - m)));
        bw.write(combination.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static BigInteger getFactorials(int n) {
        if(factorials[n] == null) {
            factorials[n] = new BigInteger(String.valueOf(n)).multiply(getFactorials(n - 1));
            return factorials[n];
        } else if (n <= 1) {
            return new BigInteger("1");
        } else {
            return factorials[n];
        }
    }
}
