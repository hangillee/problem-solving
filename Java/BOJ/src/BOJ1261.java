import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ1261 {
    static int N, M;
    static int[][] maze;
    static int[] toRow = {-1, 1, 0, 0};
    static int[] toCol = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        maze = new int[N][M];

        for(int i = 0; i < N; i++) {
            String line = br.readLine();
            for(int j = 0; j < M; j++) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }

        bw.write(String.valueOf(ZeroOneBFS(new Node(0, 0, 0))));
        bw.flush();
        bw.close();
        br.close();
    }

    public static int ZeroOneBFS(Node node) {
        Deque<Node> deque = new ArrayDeque<>();
        deque.offer(node);

        while(!deque.isEmpty()) {
            Node currentNode = deque.poll();
            if(currentNode.row == N-1 && currentNode.col == M-1) {
                return currentNode.cost;
            }
            for(int i = 0; i < 4; i++) {
                int nextRow = currentNode.row + toRow[i];
                int nextCol = currentNode.col + toCol[i];
                if(nextRow >= 0 && nextCol >= 0 && nextRow < N && nextCol < M) {
                    if(maze[nextRow][nextCol] == 1) {
                        deque.addLast(new Node(nextRow, nextCol, currentNode.cost+1));
                    } else if(maze[nextRow][nextCol] == 0) {
                        deque.addFirst(new Node(nextRow, nextCol, currentNode.cost));
                    }
                    maze[nextRow][nextCol] = -1;
                }
            }
        }
        return 0;
    }

    static class Node {
        int row;
        int col;
        int cost;
        Node(int row, int col, int cost) {
            this.row = row;
            this.col = col;
            this.cost = cost;
        }
    }
}
