import java.math.BigInteger;
import java.util.Scanner;

public class BOJ2338 {
    public static void main(String[] args){
        Scanner numScan = new Scanner(System.in);

        BigInteger firstNum = numScan.nextBigInteger();
        BigInteger secondNum = numScan.nextBigInteger();

        System.out.println(firstNum.add(secondNum));
        System.out.println(firstNum.subtract(secondNum));
        System.out.println(firstNum.multiply(secondNum));
    }
}
