import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		
		triangleLB(length);
		scan.close();
	}
	
	static void triangleLB(int n){
		for (int i = 0; i < n; i++){
			for (int j = 0; j <= i; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}