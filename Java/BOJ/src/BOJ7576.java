import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ7576 {
    static int[][] box;
    static int[] directionRow = {-1, 1, 0, 0}; //상하
    static int[] directionCol = {0, 0, -1, 1}; //좌우
    static int N; //행
    static int M; //열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        int row = N;
        int col = M;

        box = new int[row][col];

        for(int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < col; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        BFS();

        int max = box[0][0];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(box[i][j] == 0) {
                    i = row;
                    max = -1;
                    break;
                }
                max = Math.max(max, box[i][j]);
            }
        }
        max = (max == -1) ? max : max -1;
        bw.write(max + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static void BFS() {
        Queue<Node> queue = new LinkedList<>();

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(box[i][j] == 1) {
                    queue.offer(new Node(i, j));
                }
            }
        }

        while(!queue.isEmpty()) {
            Node tomato = queue.poll();
            for(int i = 0; i < 4; i++) {
                int currentRow = tomato.row + directionRow[i];
                int currentCol = tomato.col + directionCol[i];
                if(currentRow >= 0 && currentCol >= 0 && currentRow < N && currentCol < M) {
                    if(box[currentRow][currentCol] == 0) {
                        queue.offer(new Node(currentRow, currentCol));
                        box[currentRow][currentCol] = box[tomato.row][tomato.col] + 1;
                    }
                }
            }
        }
    }
}

class Node {
    public int row = 0;
    public int col = 0;
    Node(int row, int col) {
        this.row = row;
        this.col = col;
    }
}