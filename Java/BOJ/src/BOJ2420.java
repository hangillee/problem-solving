import java.util.Scanner;

public class BOJ2420 {
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
        long fameN = numScan.nextLong();
        long fameM = numScan.nextLong();

        System.out.print(compareFame(fameN, fameM));
    }

    public static long compareFame(long fameN, long fameM) {
        if(fameN > fameM) {
            return fameN - fameM;
        }
        else {
            return fameM - fameN;
        }
    }
}
