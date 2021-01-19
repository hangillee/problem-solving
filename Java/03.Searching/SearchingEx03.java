import java.util.Scanner;
import java.util.Random;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("요솟수 : ");
		int num = scan.nextInt();
		int[] array = new int[num];
		int[] idx = new int[num];
		
		for (int i = 0; i < num; i++){
			array[i] = 1 + rand.nextInt(9);
			System.out.println("array[" + i + "] = "+array[i]);
		}
		
		System.out.print("검색할 값 : ");
		int key = scan.nextInt();
		int times = searchIndex(array, num, key, idx);
		
		System.out.println("검색한 값의 갯수 : "+times);
		for (int i = 0; i < times; i++){
			System.out.println("idx["+ i + "] = "+idx[i]);
		}
		
		scan.close();
	}
	static int searchIndex(int[] array, int num, int key, int[] idx){
		int times = 0;
		
		for (int i = 0; i < num; i++){
			if(array[i] == key){
				idx[times] = i;
				times++;
			}
		}
		return times;
	}
}