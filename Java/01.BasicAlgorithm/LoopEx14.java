import java.util.Scanner;

class LoopEx14 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for (int i = 0; i < num; i++){
			for (int j = 0; j < num; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();
	}
}