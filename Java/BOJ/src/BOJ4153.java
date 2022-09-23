import java.io.*;
import java.util.Arrays;

public class BOJ4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String command = br.readLine();
            if(command.equals("0 0 0")) {
                break;
            }

            String[] numStr = command.split(" ");
            int[] nums = new int[numStr.length];
            for(int i = 0; i < nums.length; i++) {
                nums[i] = Integer.parseInt(numStr[i]);
            }
            Arrays.sort(nums);

            if((nums[0]*nums[0]) + (nums[1]*nums[1]) == (nums[2]*nums[2])) {
                bw.write("right\n");
            } else {
                bw.write("wrong\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
