import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2146 {
    static int[][] map;
    static boolean[][] isVisited;
    static int N;
    static int islandNum = 2;
    static int[] rowChange = {-1, 1, 0, 0};
    static int[] colChange = {0, 0, -1, 1};
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        isVisited = new boolean[N][N];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //네이밍은 성공했어
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(map[i][j] == 1 && !isVisited[i][j]) {
                    DFS(i, j);
                    islandNum++;
                }
            }
        }
        // 다리구하기
        isVisited = new boolean[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(map[i][j] != 0 && !isVisited[i][j]) {
                    isVisited = new boolean[N][N];
                    BFS(i, j);
                }
            }
        }

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void DFS(int row, int col) {
        isVisited[row][col] = true;
        map[row][col] = islandNum;

        for(int i = 0; i < 4; i++) {
            int nextRow = row + rowChange[i];
            int nextCol = col + colChange[i];
            if(nextRow >= 0 && nextCol >= 0 && nextRow < N && nextCol < N) {
                if(map[nextRow][nextCol] != 0 && !isVisited[nextRow][nextCol]) {
                    map[nextRow][nextCol] = islandNum;
                    isVisited[nextRow][nextCol] = true;
                    DFS(nextRow, nextCol);
                }
            }
        }
    }
    public static void BFS(int row, int col) {
        Queue<MapNode> queue = new LinkedList<>();
        queue.offer(new MapNode(row, col, 0));
        int currentIsland = map[row][col];
        isVisited[row][col] = true;

        while(!queue.isEmpty()) {
            MapNode nextNode = queue.poll();
            for(int i = 0; i < 4; i++) {
                int childRow = nextNode.row + rowChange[i];
                int childCol = nextNode.col + colChange[i];
                if(childRow >= 0 && childCol >= 0 && childRow < N && childCol < N) {
                    if(map[childRow][childCol] != 0 && map[childRow][childCol] != currentIsland && !isVisited[childRow][childCol]) {
                        min = Math.min(min, nextNode.distance);
                        return;
                    }
                    if(map[childRow][childCol] == 0 && !isVisited[childRow][childCol]) {
                        int distance = nextNode.distance + 1;
                        queue.offer(new MapNode(childRow, childCol, distance));
                        isVisited[childRow][childCol] = true;
                    }
                }
            }
        }
    }
}

class MapNode {
    int row;
    int col;
    int distance;
    MapNode(int row, int col, int distance) {
        this.row = row;
        this.col = col;
        this.distance = distance;
    }
}