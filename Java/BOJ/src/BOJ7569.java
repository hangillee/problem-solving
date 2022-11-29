import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ7569 {
    static int[] directionRow = {-1, 0, 1, 0, 0, 0}; //앞, 뒤, 좌, 우, 위, 아래
    static int[] directionCol = {0, 1, 0, -1, 0, 0};
    static int[] directionHeight = {0, 0, 0, 0, 1, -1};
    static int M;
    static int N;
    static int H;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        int[][][] tomatoBox = new int[H][N][M];

        Queue<Tomato> bfsQueue = new ArrayDeque<>();
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k < M; k++) {
                    tomatoBox[i][j][k] = Integer.parseInt(st.nextToken());
                    if(tomatoBox[i][j][k] == 1) {
                        bfsQueue.offer(new Tomato(i, j, k));
                    }
                }
            }
        }

        BFS(tomatoBox, bfsQueue);

        boolean isCompleted = true;
        int result = 0;
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < N; j++) {
                for(int k = 0; k < M; k++) {
                    if(tomatoBox[i][j][k] == 0) {
                        isCompleted = false;
                        break;
                    } else {
                        result = Math.max(result, tomatoBox[i][j][k]);
                    }
                }
            }
        }

        if(isCompleted) {
            bw.write(String.valueOf(result - 1));
        } else {
            bw.write("-1");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void BFS(int[][][] tomatoBox, Queue<Tomato> queue) {
        while(!queue.isEmpty()) {
            Tomato currentTomato = queue.poll();
            int height = currentTomato.height;
            int row = currentTomato.row;
            int col = currentTomato.col;
            for(int i = 0; i < 6; i++) {
                int changedHeight = height + directionHeight[i];
                int changedRow = row + directionRow[i];
                int changedCol = col + directionCol[i];
                if(changedHeight >= 0 && changedHeight < H && changedRow >= 0 && changedRow < N && changedCol >= 0 && changedCol < M) {
                    if(tomatoBox[changedHeight][changedRow][changedCol] == 0) {
                        queue.offer(new Tomato(changedHeight, changedRow, changedCol));
                        tomatoBox[changedHeight][changedRow][changedCol] = tomatoBox[height][row][col] + 1;
                    }
                }
            }
        }
    }

    static class Tomato {
        int height;
        int row;
        int col;
        public Tomato(int height, int row, int col) {
            this.height = height;
            this.row = row;
            this.col = col;
        }
    }
}
