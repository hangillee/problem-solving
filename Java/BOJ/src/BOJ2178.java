import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2178 {
    static int[][] maze;
    static int N, M;
    static int[] directionRow = {-1, 1, 0, 0};
    static int[] directionCol = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        maze = new int[N][M];

        for(int i = 0; i < N; i++) {
            String line = br.readLine();
            for(int j = 0; j < M; j++) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                BFS(i, j);
            }
        }

        bw.write(String.valueOf(maze[N-1][M-1]));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void BFS(int row, int col){
        Queue<MazeNode> nodes = new LinkedList<>();
        nodes.offer(new MazeNode(row, col));

        while(!nodes.isEmpty()) {
            MazeNode nextNode = nodes.poll();
            for(int i = 0; i < 4; i++) {
                int childNodeRow = nextNode.row + directionRow[i];
                int childNodeCol = nextNode.col + directionCol[i];
                if(childNodeRow >= 0 && childNodeCol >= 0 && childNodeRow < N && childNodeCol < M) {
                    if(maze[childNodeRow][childNodeCol] == 1) {
                        nodes.offer(new MazeNode(childNodeRow, childNodeCol));
                        maze[childNodeRow][childNodeCol] = maze[nextNode.row][nextNode.col] + 1;
                    }
                }
            }
        }
    }
}

class MazeNode {
    int row;
    int col;

    MazeNode(int row, int col) {
        this.row = row;
        this.col = col;
    }
}