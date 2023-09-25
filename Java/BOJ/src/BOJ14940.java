import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ14940 {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int rootX;
    static int rootY;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] numMap = new int[n][m];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                numMap[i][j] = Integer.parseInt(st.nextToken());
                if(numMap[i][j] == 2) {
                    rootX = j;
                    rootY = i;
                }
            }
        }

        boolean[][] isVisited = new boolean[n][m];
        int[][] resultMap = BFS(numMap, isVisited);
        for(int i = 0; i < resultMap.length; i++) {
            for(int j = 0; j < resultMap[i].length; j++) {
                if(numMap[i][j] != 0 && !isVisited[i][j]) {
                    bw.write("-1 ");
                } else {
                    bw.write(resultMap[i][j] + " ");
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static int[][] BFS(int[][] numMap, boolean[][] isVisited) {
        int[][] resultMap = new int[numMap.length][numMap[0].length];
        Deque<BFSNode> queue = new ArrayDeque<>();
        queue.offer(new BFSNode(rootY, rootX));
        resultMap[rootY][rootX] = 0;
        isVisited[rootY][rootX] = true;

        while(!queue.isEmpty()) {
            BFSNode currentNum = queue.poll();
            for(int i = 0; i < dy.length; i++) {
                int row = currentNum.row + dy[i];
                int col = currentNum.col + dx[i];
                if(row >= 0 && col >= 0 && row < numMap.length && col < numMap[0].length) {
                    if(numMap[row][col] != 0 && !isVisited[row][col]) {
                        isVisited[row][col] = true;
                        resultMap[row][col] = resultMap[row-dy[i]][col-dx[i]] + 1;
                        queue.add(new BFSNode(row, col));
                    }
                }
            }
        }

        return resultMap;
    }
}

class BFSNode {
    int row;
    int col;

    public BFSNode(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
