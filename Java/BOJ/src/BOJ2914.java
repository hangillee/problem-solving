import java.util.Scanner;

public class BOJ2914 {
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);

        int songNum = numScan.nextInt();
        int avgMelody = numScan.nextInt();
        int minCopyright = ((songNum * avgMelody) - songNum) + 1;

        System.out.println(minCopyright);
        numScan.close();
    }
}
