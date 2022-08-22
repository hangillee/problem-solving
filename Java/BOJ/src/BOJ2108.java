import java.io.*;
import java.util.Arrays;

public class BOJ2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Integer[] nums = new Integer[N];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(nums);

        bw.write(getAverage(nums) + "\n");
        bw.write(getMedian(nums) + "\n");
        bw.write(nums[getMode(nums)] + "\n");
        bw.write(getRange(nums) + "\n");

        bw.flush();
        bw.close();
    }

    private static int getAverage(Integer[] nums) {
        int sum = 0;
        for(int i : nums) {
            sum += i;
        }
        return (int)Math.round((double) sum / nums.length);
    }

    private static int getMedian(Integer[] nums) {
        int index = nums.length / 2;
        return nums[index];
    }

    private static int getMode(Integer[] nums) {
        int index = 0;
        int max = 0;
        boolean findMax = false;

        for(int i = 0; i < nums.length; i++) {
            int sameNums = 0;
            int count = 1;

            for(int j = i+1; j < nums.length; j++) {
                if(!(nums[i].equals(nums[j]))) {
                    break;
                }
                count++;
                sameNums++;
            }
            if(max < count) {
                max = count;
                index = i;
                findMax = true;
            } else if (max == count && findMax) {
                index = i;
                findMax = false;
            }

            i += sameNums;
        }
        return index;
    }

    private static int getRange(Integer[] nums) {
        int minimum = nums[0];
        int maximum = nums[nums.length - 1];
        return maximum - minimum;
    }
}
