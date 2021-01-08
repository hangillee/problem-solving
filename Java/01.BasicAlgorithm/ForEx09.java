import java.util.Scanner;

class ForEx09 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(sumof(a, b));
		scan.close();
	}
	
	static int sumof(int a, int b){
		int sum = 0;
		if (a > b){
			for (int i = b; i <= a; i++){
				sum += i;
			}
			return sum;
		}
		else if (a < b) {
			for (int i = a; i <= b; i++){
				sum += i;
			}
			return sum;
		}
		else {
			return a;
		}
	}
}