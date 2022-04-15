import java.math.BigInteger;
import java.util.Scanner;

public class BOJ {
    public static void main(String[] args){
        Scanner numScan = new Scanner(System.in);
        BigInteger m = numScan.nextBigInteger();
        BigInteger n = numScan.nextBigInteger();

        System.out.println(m.divide(n));
        System.out.println(m.remainder(n));

        numScan.close();
    }
}
