import java.util.Scanner;

class ForEx07 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= num; i++){
            sum += i;
            if (i == num){
                System.out.println(i + " = " + sum);
            }
            else {
                System.out.print(i + " + ");   
            }
        }
        scan.close();
    }
}