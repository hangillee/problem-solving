package BOJ1655;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> minPriorityQueue = new PriorityQueue<>();
        PriorityQueue<Integer> maxPriorityQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(br.readLine());
            if (maxPriorityQueue.size() == minPriorityQueue.size()) {
                maxPriorityQueue.add(number);
            } else {
                minPriorityQueue.add(number);
            }

            if (!maxPriorityQueue.isEmpty() && !minPriorityQueue.isEmpty()) {
                if (maxPriorityQueue.peek() > minPriorityQueue.peek()) {
                    int temp = maxPriorityQueue.poll();
                    maxPriorityQueue.add(minPriorityQueue.poll());
                    minPriorityQueue.add(temp);
                }
            }
            bw.write(maxPriorityQueue.peek() + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
