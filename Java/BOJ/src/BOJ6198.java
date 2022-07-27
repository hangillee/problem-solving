import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ6198 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        long isViewable = 0;
        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < N; i++) {
            int target = nums[i];
            for(int j = i+1; j < N; j++) {
                if(nums[j] < target) {
                    isViewable++;
                } else {
                    break;
                }
            }
        }

        bw.write(String.valueOf(isViewable));
        bw.flush();
        bw.close();
        br.close();
    }
}
