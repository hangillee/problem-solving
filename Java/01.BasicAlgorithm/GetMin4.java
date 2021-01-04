import java.util.Scanner;

class GetMin4 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[] numArray = new int[4];
        
        for (int i = 0; i < 4; i++){
            numArray[i] = scan.nextInt();
        }
        
        System.out.println("Min : " + min4(numArray[0], numArray[1], numArray[2], numArray[3]));
        scan.close();
    }
    static int min4(int a, int b, int c, int d){
        if (a > b){
            if (b > c){
                if (c > d){
                    return d;
                }
                else {
                    return c;
                }
            }
            else if (b > d){
                return d;
            }
            else {
                return b;
            }
        }
        else if (a > c){
            if (c > d){
                return d;
            }
            else {
                return c;
            }
        }
        else if (a > d) {
            return d;
        }
        else {
            return a;
        }
    }
}