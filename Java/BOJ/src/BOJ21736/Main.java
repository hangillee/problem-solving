package BOJ21736;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    private static final int[] dx = { 0, 0, -1, 1 };
    private static final int[] dy = { -1, 1, 0, 0 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[][] campus = new String[N][M];
        boolean[][] isVisited = new boolean[N][M];
        Deque<int[]> graph = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String campusInfo = br.readLine();
            for (int j = 0; j < M; j++) {
                String object = String.valueOf(campusInfo.charAt(j));
                campus[i][j] = object;
                if (object.equals("I")) {
                    graph.offer(new int[]{i, j});
                }
            }
        }

        int meetCount = 0;
        while(!graph.isEmpty()) {
            int[] coord = graph.poll();
            int currentY = coord[0];
            int currentX = coord[1];
            isVisited[currentY][currentX] = true;

            for (int i = 0; i < 4; i++) {
                int nextY = currentY + dy[i];
                int nextX = currentX + dx[i];
                if (nextY < 0 || nextY >= N || nextX < 0 || nextX >= M || campus[nextY][nextX].equals("X")) {
                    continue;
                }
                if (campus[nextY][nextX].equals("P") && !isVisited[nextY][nextX]) {
                    meetCount++;
                    isVisited[nextY][nextX] = true;
                    graph.offer(new int[]{nextY, nextX});
                }
                if (campus[nextY][nextX].equals("O") && !isVisited[nextY][nextX]) {
                    isVisited[nextY][nextX] = true;
                    graph.offer(new int[]{nextY, nextX});
                }
            }
        }

        if (meetCount == 0) {
            bw.write("TT");
        } else {
            bw.write(meetCount + "");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
