package BOJ1655;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            queue.add(Integer.parseInt(br.readLine()));

            List<Integer> temp = new LinkedList<>();
            if (queue.size() == 1) {
                bw.write(queue.peek() + "\n");
                continue;
            }
            if (queue.size() % 2 == 0) {
                int currentSize = queue.size();
                for (int j = 0; j < currentSize / 2 - 1; j++) {
                    temp.add(queue.poll());
                }
            } else {
                int currentSize = queue.size();
                for (int j = 0; j < currentSize / 2; j++) {
                    temp.add(queue.poll());
                }
            }
            bw.write(queue.peek() + "\n");
            queue.addAll(temp);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
