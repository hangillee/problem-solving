import java.io.*;
import java.util.Arrays;

public class BOJ2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nums);
        for(int i : nums) {
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
