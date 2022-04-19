import java.util.Scanner;

public class BOJ3003 {
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
        int[] inputArr = new int[6];
        int[] chessArr = {1, 1, 2, 2, 2, 8};

        for(int i = 0; i < inputArr.length; i++) {
           inputArr[i] = numScan.nextInt();
           inputArr[i] = chessArr[i] - inputArr[i];
           System.out.print(inputArr[i] + " ");
        }
        numScan.close();
    }
}
