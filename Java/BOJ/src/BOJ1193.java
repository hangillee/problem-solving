import java.util.Scanner;

public class BOJ1193 {
    public static void main(String[] args){
        Scanner numScan = new Scanner(System.in);
        int orderNum = numScan.nextInt();
        int counter = 0;
        int row = 0;

        while(true) {
            row++;
            counter += row;
            if(counter >= orderNum) {
                if(row % 2 == 0) {

                }
                else {

                }
            }
        }
    }
}
