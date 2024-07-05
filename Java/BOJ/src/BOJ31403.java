import java.util.Scanner;

public class BOJ31403 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String A = scanner.nextLine();
        final String B = scanner.nextLine();
        final String C = scanner.nextLine();

        System.out.println(Integer.parseInt(A) + Integer.parseInt(B) - Integer.parseInt(C));
        System.out.println(Integer.parseInt(A + B) - Integer.parseInt(C));

        scanner.close();
    }
}
