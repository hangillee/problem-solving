import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Tower> stack = new ArrayDeque<>();

        for(int i = 1; i <= N; i++) {
            int num = Integer.parseInt(st.nextToken());
            while(!stack.isEmpty()) {
                if(stack.peek().height >= num) {
                    bw.write(stack.peek().order + " ");
                    break;
                }
                stack.pop();
            }
            if(stack.isEmpty()) {
                bw.write("0 ");
            }
            stack.push(new Tower(i, num));
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static class Tower {
        int order;
        int height;

        Tower(int order, int height) {
            this.order = order;
            this.height = height;
        }
    }
}
