import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ17608 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            stack.push(num);
        }

        int top = stack.pop();
        int count = 1;
        while(!stack.isEmpty()) {
            int next = stack.pop();
            if(next > top) {
                top = next;
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
