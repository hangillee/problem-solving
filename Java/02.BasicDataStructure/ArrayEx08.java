import java.util.Scanner;

class Main {
	static int[][] monthDays = {
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("올해 지난 일 수를 구합니다.");
		System.out.print("년 : "); int year = scan.nextInt();
		System.out.print("월 : "); int month = scan.nextInt();
		System.out.print("일 : "); int day = scan.nextInt();
		
		System.out.println(year + "년은 " + dayOfYear(year, month, day) + "일 지났습니다.");
		scan.close();
	}
	
	static int isLeap(int year){
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	static int dayOfYear(int y, int m, int d){
		int months = 0;
		while(months < m-1){
			d += monthDays[isLeap(y)][months++];
		}
		return d;
	}
}