import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ2667 {
    static char[][] graph;
    static boolean[][] isVisited;
    static int complex = 0;
    static int[] aparts;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        graph = new char[N][N];
        aparts = new int[N * N];
        isVisited = new boolean[N][N];

        for(int i = 0; i < graph.length; i++) {
            String line = br.readLine();
            for(int j = 0; j < graph.length; j++) {
                graph[i][j] = line.charAt(j);
            }
        }

        for(int i = 0; i < graph.length; i++) {
            for(int j = 0; j < graph.length; j++) {
                if(graph[i][j] == '1' && !isVisited[i][j]) {
                    complex++;
                    BFS(i, j);
                }
            }
        }

        bw.write(complex + "\n");
        bw.flush();

        Arrays.sort(aparts);

        for(int i = 0; i < aparts.length; i++) {
            if(aparts[i] != 0) {
                bw.write(aparts[i]+"\n");
                bw.flush();
            }
        }
    }

    public static void BFS(int nodeRow, int nodeCol) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{nodeRow, nodeCol});
        isVisited[nodeRow][nodeCol] = true;

        while(!queue.isEmpty()) {
            int currentX = queue.peek()[0];
            int currentY = queue.peek()[1];
            aparts[complex]++;
            queue.poll();

            for(int i = 0; i < 4; i++) {
                int x = currentX + dx[i];
                int y = currentY + dy[i];
                if(x >= 0 && y >= 0 && x < N && y < N) {
                    if(graph[x][y] == '1' && !isVisited[x][y]) {
                        queue.add(new int[]{x, y});
                        isVisited[x][y] = true;
                    }
                }
            }
        }
    }
}
