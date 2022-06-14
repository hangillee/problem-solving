import java.util.Scanner;

public class BOJ2439 {
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
        int line = numScan.nextInt();

        for(int i = 0; i < line; i++) {
            for(int j = 1; j < line - i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
