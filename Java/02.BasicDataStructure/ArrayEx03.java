import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int idxNum = scan.nextInt();
		int[] array = new int[idxNum];
		
		for (int i = 0; i < array.length; i++){
			System.out.print("array["+ i +"] = ");
			array[i] = scan.nextInt();
		}
		
		System.out.println("배열의 합계 : " + sum(array));
		scan.close();
	}
	static int sum(int[] a){
		int sum = 0;
		for (int i = 0; i < a.length; i++){
			sum += a[i];
		}
		return sum;
	}
}