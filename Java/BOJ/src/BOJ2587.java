import java.io.*;
import java.util.Arrays;

public class BOJ2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] nums = new int[5];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nums);

        int sum = 0;
        for(int i : nums) {
            sum += i;
        }

        bw.write((sum / 5) + "\n");
        bw.write(String.valueOf(nums[5/2]));
        bw.flush();
        bw.close();
        br.close();
    }
}
