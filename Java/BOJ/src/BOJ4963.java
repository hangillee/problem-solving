import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ4963 {
    static int[][] graph;
    static int islandCount = 0;
    static boolean[][] isVisited;
    static int[] directionX = {0, -1, -1, -1, 0, 1, 1, 1};
    static int[] directionY = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int X, Y;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            islandCount = 0;
            X = Integer.parseInt(st.nextToken());
            Y = Integer.parseInt(st.nextToken());
            if(X == 0 && Y == 0) {
                break;
            }
            graph = new int[Y][X];
            isVisited = new boolean[Y][X];

            for(int i = 0; i < Y; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < X; j++) {
                    graph[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for(int i = 0; i < Y; i++) {
                for(int j = 0; j < X; j++) {
                    if(graph[i][j] == 1 && !isVisited[i][j]) {
                        islandCount++;
                        BFS(i, j);
                    }
                }
            }
            bw.write(islandCount + "\n");
            bw.flush();
        }
    }

    public static void BFS(int row, int col) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{row, col});
        isVisited[row][col] = true;

        while(!queue.isEmpty()) {
            int[] node = queue.poll();
            for(int i = 0; i < 8; i++) {
                int currentRow = node[0] + directionX[i];
                int currentCol = node[1] + directionY[i];
                if(currentRow >= 0 && currentCol >= 0 && currentRow < Y && currentCol < X) {
                    if(graph[currentRow][currentCol] == 1 && !isVisited[currentRow][currentCol]) {
                        queue.offer(new int[]{currentRow, currentCol});
                        isVisited[currentRow][currentCol] = true;
                    }
                }
            }
        }
    }
}
