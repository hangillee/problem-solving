import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class BOJ10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> stack = new LinkedList<>();
        int K = Integer.parseInt(br.readLine());

        for(int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }

        int sum = 0;
        int size = stack.size();
        for(int i = 0; i < size; i++) {
            sum += stack.pop();
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}
