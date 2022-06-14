import java.util.Scanner;

public class BOJ2442 {
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
        int line = numScan.nextInt();

        for(int i = 1; i <= line; i++) {
            for(int k = 0; k < line - i; k++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
