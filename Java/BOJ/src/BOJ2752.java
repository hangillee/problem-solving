import java.io.*;
import java.util.StringTokenizer;

public class BOJ2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[3];
        for(int i = 0; i < 3; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        //버블 정렬
        for(int i = 1; i < 3; i++) {
            for(int j = 0; j < 3 - i; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for(int i : nums) {
            bw.write(i + " ");
            bw.flush();
        }

        bw.close();
        br.close();
    }
}
