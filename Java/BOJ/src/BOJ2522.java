import java.util.Scanner;

public class BOJ2522 {
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
        int line = numScan.nextInt();

        for(int i = 1; i <= line; i++) {
            for(int j = 0; j < line - i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i < line; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < line - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
