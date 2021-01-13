import java.util.Scanner;

class ArrayEx02 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int idxNum = scan.nextInt();
		int[] array = new int[idxNum];
		
		for (int i = 0; i < array.length; i++){
			System.out.print("array["+ i +"] = ");
			array[i] = scan.nextInt();
		}
		
		reverse(array);
		scan.close();
	}
	static void reverse(int[] array){
		for (int i = 0; i <= array.length / 2; i++){
			for(int j = 0; j < array.length; j++){
				System.out.print(array[j] + " ");	
			}
			System.out.println("array["+i+"]" + "와 " + "array["+ (array.length - i - 1) + "]" + "를 교환합니다.");
			int t = array[i];
			array[i] = array[array.length-i-1];
			array[array.length-i-1] = t;
		}
	}
}