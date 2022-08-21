import java.io.*;
import java.util.StringTokenizer;

public class BOJ1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[] nums = new int[B+1];
        int index = 1;

        for(int i = 1; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                nums[index] = i;
                index++;
                if(index >= nums.length) {
                    i = nums.length;
                    break;
                }
            }
        }
        int answer = 0;
        for(int i = A; i < nums.length; i++) {
            answer += nums[i];
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
