package BOJ16928;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static final Map<Integer, Integer> routes = new HashMap<>();
    private static final boolean[] isVisited = new boolean[101];
    private static final int[] distance = new int[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N + M; i++) {
            st = new StringTokenizer(br.readLine());
            int before = Integer.parseInt(st.nextToken());
            int after = Integer.parseInt(st.nextToken());
            routes.put(before, after);
        }

        bfs();

        bw.write(distance[100] + "");
        bw.flush();
        bw.close();
        br.close();
    }

    private static void bfs() {
        Queue<Integer> nodes = new LinkedList<>();
        nodes.offer(1);
        isVisited[1] = true;
        distance[1] = 0;

        while (!nodes.isEmpty()) {
            int currentNode = nodes.poll();
            if (currentNode == 100) {
                return;
            }
            for (int i = 1; i <= 6; i++) {
                int nextNode = currentNode + i;
                if (nextNode <= 100) {
                    if (routes.containsKey(nextNode)) {
                        nextNode = routes.get(nextNode);
                    }
                    if (!isVisited[nextNode]) {
                        isVisited[nextNode] = true;
                        distance[nextNode] = distance[currentNode] + 1;
                        nodes.offer(nextNode);
                    }
                }
            }
        }
    }
}
