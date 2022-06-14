import java.util.Scanner;

public class BOJ10953 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int testCase = myScan.nextInt();
        String[] numbers = new String[testCase];
        String[] splitResult = new String[2];
        String temp = myScan.nextLine();

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = myScan.nextLine();
        }

        for(int i = 0; i < numbers.length; i++) {
            splitResult = numbers[i].split(",");
            System.out.println(Integer.parseInt(splitResult[0]) + Integer.parseInt(splitResult[1]));
        }
    }
}
