import java.util.Scanner;

public class BOJ10818 {
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
        int testCase = numScan.nextInt();
        int[] testNum = new int[testCase];
        int maxNum, minNum;

        for(int i = 0; i < testNum.length; i++) {
            testNum[i] = numScan.nextInt();
        }

        maxNum = testNum[0];
        minNum = testNum[0];

        for(int num : testNum) {
            if(maxNum < num) {
                maxNum = num;
            }
            if(minNum > num) {
                minNum = num;
            }
        }

        System.out.println(minNum + " " + maxNum);
    }
}
