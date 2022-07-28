import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] ans = new int[N];
        Arrays.fill(ans, -1);

        Deque<NGE> nums = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            while(!nums.isEmpty() && num > nums.peek().number) {
                ans[nums.pop().index] = num;
            }
            nums.push(new NGE(i, num));
        }

        for(int i : ans) {
            bw.write(i + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static class NGE{
        int index;
        int number;

        NGE(int index, int number) {
            this.index = index;
            this.number = number;
        }
    }
}
