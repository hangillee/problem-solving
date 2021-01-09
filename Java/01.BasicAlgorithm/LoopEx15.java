import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		
		triangleLB(length);
		triangleLU(length);
		triangleRU(length);
		triangleRB(length);
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
	
	static void triangleLU(int n){
		for (int i = n; i > 0; i--){
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	static void triangleRU(int n){
		for (int i = 0; i < n; i++){
			for(int k = 0; k < i; k++){
				System.out.print(" ");
			}
			for(int j = n; j > i; j--){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	static void triangleRB(int n){
		for (int i = 1; i <= n; i++){
			for(int k = n; k > i; k--){
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}