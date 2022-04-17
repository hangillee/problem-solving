import java.util.Scanner;

public class BOJ2475 {
    public static void main(String[] args){
        Scanner numScan = new Scanner(System.in);
        int[] idNum = new int[5];
        int confirmNum = 0;

        for (int i = 0; i < 5; i++){
            idNum[i] = numScan.nextInt();
        }

        for (int j = 0; j < 5; j++){
            confirmNum += (idNum[j] * idNum[j]);
        }

        System.out.println(confirmNum % 10);
    }
}
