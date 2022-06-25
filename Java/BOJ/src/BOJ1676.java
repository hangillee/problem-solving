import java.io.*;
import java.math.BigInteger;

public class BOJ1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger N = new BigInteger(br.readLine());
        BigInteger i = new BigInteger("2");
        BigInteger one = new BigInteger("1");
        BigInteger facto = new BigInteger("1");

        while(i.compareTo(N) < 1) {
            facto = facto.multiply(i);
            i = i.add(one);
        }

        int count = 0;
        String findZero = facto.toString();
        for(int j = findZero.length()-1; j >= 0; j--) {
            if(findZero.charAt(j) != '0') {
                break;
            }
            count++;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
