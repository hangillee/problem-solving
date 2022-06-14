import java.util.Scanner;

public class BOJ2446 {
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
        int line = numScan.nextInt();

        for(int i = 0; i < line; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < line * 2 - i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i < line; i++) {
            for(int j = 1; j < line - i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
