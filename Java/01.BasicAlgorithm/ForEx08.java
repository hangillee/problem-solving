//가우스 덧셈

import java.util.Scanner;

class ForEx08 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int gausNum = 0;
		int wantNum = scan.nextInt();
		
		gausNum = ((1 + wantNum) * wantNum) / 2;
		
		System.out.println("Gaus Sum : " + gausNum);
		scan.close();
	}
}