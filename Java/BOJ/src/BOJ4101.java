import java.util.Scanner;

public class BOJ4101 {
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
        int firstNum = numScan.nextInt();
        int secondNum = numScan.nextInt();

        while (firstNum != 0 && secondNum != 0) {
            if(firstNum > secondNum) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            firstNum = numScan.nextInt();
            secondNum = numScan.nextInt();

        }
    }
}
