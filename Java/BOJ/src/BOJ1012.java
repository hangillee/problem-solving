import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1012 {
    static int[][] farm;
    static boolean[][] isVisited;
    static int M, N, K;
    static int[] rowDirection = {-1, 1, 0, 0};
    static int[] colDirection = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            farm = new int[M][N];
            isVisited = new boolean[M][N];
            for(int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int row = Integer.parseInt(st.nextToken());
                int col = Integer.parseInt(st.nextToken());

                farm[row][col] = 1;
            }

            for(int j = 0; j < M; j++) {
                for(int l = 0; l < N; l++) {
                    if(farm[j][l] == 1 && !isVisited[j][l]) {
                        BFS(j, l);
                        count++;
                    }
                }
            }

            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void BFS(int row, int col) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(row, col));
        isVisited[row][col] = true;

        while(!queue.isEmpty()) {
            Node currentNode = queue.poll();
            for(int i = 0; i < 4; i++) {
                int nextRow = currentNode.row + rowDirection[i];
                int nextCol = currentNode.col + colDirection[i];
                if(isValid(nextRow, nextCol)) {
                    queue.add(new Node(nextRow, nextCol));
                    isVisited[nextRow][nextCol] = true;
                }
            }
        }
    }

    static boolean isValid(int row, int col) {
        if(row < 0 || col < 0 || row >= M || col >= N) {
            return false;
        } else if (isVisited[row][col]) {
            return false;
        } else return farm[row][col] != 0;
    }

    static class Node {
        int row;
        int col;
        Node(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}
