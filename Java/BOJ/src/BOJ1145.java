import java.util.Scanner;

public class BOJ1145 {
    public static void main(String[] args){
        Scanner numScan = new Scanner(System.in);
        int[] numArr = new int[5];
        int count = 0;
        int multiple = 0;

        for(int i = 0; i < 5; i++) {
            numArr[i] = numScan.nextInt();
        }
        while(count < 3) {
            count = 0;
            multiple++;
            for(int j = 0; j < 5; j++) {
                if(multiple % numArr[j] == 0) {
                    count++;
                }
            }
        }
        System.out.println(multiple);
    }
}
