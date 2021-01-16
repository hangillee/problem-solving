import java.util.Scanner;

class ArrayEx05 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[5];
		
		for (int j = 0; j < 5; j++){
			System.out.print("a["+j+"] = ");
			a[j] = scan.nextInt();
		}
		
		rcopy(a, b);
		
		for (int i = 0; i < 5; i++){
			System.out.println(b[i]);
		}
		
		scan.close();
	}
	
	static void rcopy(int a[], int b[]){
		int temp = 0;
		for (int k = 0; k < 2; k++){
			temp = a[k];
			a[k] = a[a.length - k - 1];
			a[a.length - k - 1] = temp;
		}
		for(int l = 0; l < 5; l++){
			b[l] = a[l];
		}
	}
}