import java.util.Scanner;

class LoopEx16 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int level = scan.nextInt();
		
		spira(level);
		scan.close();
	}
	static void spira(int n){
		for (int i = 1; i <= n; i++){
			for (int j = i; j < n; j++ ){
				System.out.print(" ");
			}
			for (int k = 0; k <  i * 2 - 1; k++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}