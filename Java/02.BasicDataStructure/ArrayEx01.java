import java.util.Random;

class ArrayEx01 {
	public static void main(String args[]){
		Random rand = new Random();
		int num = 5 + rand.nextInt(6);
		int[] height = new int[num];
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.println("사람 수는 " + num + "명입니다.");
		
		for (int i = 0; i < num; i++){
			height[i] = 100 + rand.nextInt(99);
			System.out.println((i+1) + "번째 : " + height[i]);
		}
		
		System.out.println("최댓값은 " + getMax(height));
	}
	
	static int getMax(int[] a){
		int max = a[0];
		
		for(int i = 1; i < a.length; i++){
			if(a[i] > max){
				max = a[i];
			}
		}
		return max;
	}
}