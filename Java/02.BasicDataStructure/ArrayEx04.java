import java.util.Scanner;

class ArrayEx04 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[5];
		
		for (int j = 0; j < 5; j++){
			System.out.print("a["+j+"] = ");
			a[j] = scan.nextInt();
		}
		
		copy(a, b);
		
		for (int i = 0; i < 5; i++){
			System.out.println(b[i]);
		}
		
		scan.close();
	}
	
	static void copy(int a[], int b[]){
		for (int k = 0; k < 5; k++){
			b[k] = a[k];
		}
	}
}