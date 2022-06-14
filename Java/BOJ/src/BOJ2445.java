import java.util.Scanner;

public class BOJ2445 {
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
        int line = numScan.nextInt();

        for(int i = 1; i <= line; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for(int k = 0; k < (line * 2) - i * 2; k++) {
                System.out.print(" ");
            }
            for(int l = 0; l < i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < line; i++) {
            for(int j = 0; j < line - i; j++) {
                System.out.print("*");
            }
            for(int k = 0; k < i * 2; k++) {
                System.out.print(" ");
            }
            for(int l = 0; l < line - i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
