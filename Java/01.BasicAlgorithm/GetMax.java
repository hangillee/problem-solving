import java.util.Scanner;

class GetMax {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[] numArray = new int[4];
        
        for (int i = 0; i < 4; i++){
            numArray[i] = scan.nextInt();
        }
        
        System.out.println("Max : " + max4(numArray[0], numArray[1], numArray[2], numArray[3]));
        scan.close();
    }
    
    static int max4(int a, int b, int c, int d){
        int maxValue = a;
        
        if (b >= maxValue){
            if (c >= b){
                if (d >= c){
                    maxValue = d;
                }
                else {
                    maxValue = c;
                }
            }
            else if(d >= b) {
                maxValue = d;
            }
            else {
                maxValue = b;
            }
        }
        else if (c >= maxValue){
            if (d >= c){
                maxValue = d;
            }
            else {
                maxValue = c;
            }
        }
        else {
            maxValue = d;
        }
        
        return maxValue;
    }
}