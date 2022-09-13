import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ16953 {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());

        int result = BFS(A, B);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }

    static int BFS(long A, long B) {
        Deque<Long> queue = new ArrayDeque<>();
        queue.add(A);

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                long currentNode = queue.poll();
                if(currentNode == B) {
                    return ++count;
                }
                if(currentNode > B) {
                    continue;
                }
                queue.add(currentNode * 2);
                queue.add(currentNode * 10 + 1);
            }
            count++;
        }
        return -1;
    }
}
