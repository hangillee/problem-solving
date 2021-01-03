import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[] numArray = new int[3];
        
        for (int i = 0; i < 3; i++){
            numArray[i] = scan.nextInt();
        }
        
        System.out.println("Min : " + min3(numArray[0], numArray[1], numArray[2]));
        scan.close();
    }
    
    static int min3(int a, int b, int c){
        int minValue = a;
        
        if (minValue > b){
            if (b > c){
                minValue = c;
            }
            else {
                minValue = b;
            }
        }
        else if (minValue > c){
            minValue = c;
        }
        else {
            
        }
        
        return minValue;
    }
}