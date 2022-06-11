import java.util.Scanner;

public class BOJ2738 {
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
        int indexRow = numScan.nextInt();
        int indexCol = numScan.nextInt();

        int[][] firstArr = new int[indexRow][indexCol];
        int[][] secondArr = new int[indexRow][indexCol];

        for (int i = 0; i < indexRow; i++) {
            for (int j = 0; j < indexCol; j++) {
                firstArr[i][j] = numScan.nextInt();
            }
        }

        for (int i = 0; i < indexRow; i++) {
            for (int j = 0; j < indexCol; j++) {
                secondArr[i][j] = numScan.nextInt();
            }
        }

        for (int i = 0; i < indexRow; i++) {
            for (int j = 0; j < indexCol; j++) {
                System.out.print(firstArr[i][j] + secondArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}