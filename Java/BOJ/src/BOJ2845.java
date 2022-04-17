import java.util.Scanner;

public class BOJ2845 {
    public static void main(String[] args){
        Scanner numScan = new Scanner(System.in);

        int perPeople = numScan.nextInt();
        int area = numScan.nextInt();
        int totalPeople = perPeople * area;

        int[] articleNum = new int[5];

        for(int i = 0; i < 5; i++){
            articleNum[i] = numScan.nextInt();
        }

        for (int j = 0; j < 5; j++){
            articleNum[j] -= totalPeople;
            System.out.print(articleNum[j] + " ");
        }
    }
}
