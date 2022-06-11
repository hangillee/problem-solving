import java.util.Scanner;

public class BOJ2615 {
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
        int[] numArr = new int[3];
        int maxValue = 0;

        for(int i = 0; i < 3; i++) {
            numArr[i] = numScan.nextInt();
        }

        maxValue = numArr[0];

        for(int j = 1; j < 3; j++) {
            if(numArr[j] > maxValue) {
                maxValue = numArr[j];
            }
        }

        System.out.println("최댓값은 : " + maxValue);
        numScan.close();
    }
}