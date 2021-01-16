import java.util.Scanner;

class ArrayEx06 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int targetNumber;
		int cardinalNumber;
		int digitNumber;
		char[] cno = new char[32];
		
		System.out.println("10진수 정수를 기수 변환합니다.");
		
		System.out.print("변환하는 음이 아닌 정수 : ");
		targetNumber = scan.nextInt();
		
		System.out.print("변환하고자 하는 진수 (2 ~ 36) : ");
		cardinalNumber = scan.nextInt();
		
		digitNumber = cardConv(targetNumber, cardinalNumber, cno);
		System.out.print(cardinalNumber+"진수로는 ");
		for(int i = 0; i < digitNumber; i++){
			System.out.print(cno[i]);
		}
		System.out.println("입니다.");
		
		scan.close();
	}
	
	static int cardConv(int tN, int cN, char[] cd){
		int digits = 0;
		char temp;
		String dChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			cd[digits++] = dChar.charAt(tN % cN);
			tN /= cN;
		} while(tN != 0);
		
		for (int i = 0; i < digits / 2; i++){
			temp = cd[i];
			cd[i] = cd[digits-i-1];
			cd[digits-i-1] = temp;
		}
		
		return digits;
	}
}