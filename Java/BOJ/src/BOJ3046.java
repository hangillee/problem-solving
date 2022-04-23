import java.util.Scanner;

public class BOJ3046 {
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);

        int r1 = 0;
        int r2 = 0;
        int s = 0;

        r1 = numScan.nextInt();
        s = numScan.nextInt();

        r2 = (s * 2) - r1;

        System.out.println(r2);
    }
}
