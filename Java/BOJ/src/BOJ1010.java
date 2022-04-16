import java.util.Scanner;

public class BOJ1010 {
    private static int[][] memo = new int[30][30];
    public static void main(String args[]){
        Scanner numScan = new Scanner(System.in);
        int testCase = numScan.nextInt();
        int a, b = 0;

        for(int i = 0; i < testCase; i++){
            a = numScan.nextInt();
            b = numScan.nextInt();

            System.out.println(getCombinationValue(a, b));
        }
    }
    static int getCombinationValue (int minNum, int maxNum) {
        if (memo[minNum][maxNum] > 0){
            return memo[minNum][maxNum];
        }
        if (minNum == maxNum || minNum == 0){
            return memo[minNum][maxNum] = 1;
        }

        return memo[minNum][maxNum] = getCombinationValue(minNum - 1, maxNum - 1) + getCombinationValue(minNum, maxNum - 1);
    }
}