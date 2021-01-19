import java.util.Scanner;

class SearchingEx01 {
	static int sentinelSearch(int[] array, int num, int key){
		array[num] = key;
		
		for (int i = 0; i < num; i++) {
			if (array[i] == key){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = scan.nextInt();
		int[] array = new int[num+1];
		
		for (int i = 0; i < num; i++){
			System.out.print("array[" + i + "] = ");
			array[i] = scan.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = scan.nextInt();
		int index = sentinelSearch(array, num, key);
		
		if (index == -1){
			System.out.println("해당 값을 찾을 수 없습니다.");
		}
		else {
			System.out.println(key+"은 "+index+"번 째에 있습니다.");
		}
		
		scan.close();
	}
}