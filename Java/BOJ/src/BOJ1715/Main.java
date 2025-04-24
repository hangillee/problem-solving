package BOJ1715;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
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
        }

        List<Integer> results = new ArrayList<>();
        while (!queue.isEmpty() && queue.size() >= 2) {
            int x = queue.poll();
            int y = queue.poll();

            int sum = x + y;
            results.add(sum);
            queue.add(sum);
        }

        int answer = results.stream()
                .mapToInt(Integer::intValue)
                .sum();

        bw.write(answer + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
