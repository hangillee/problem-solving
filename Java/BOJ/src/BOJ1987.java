import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ1987 {
    static char[][] board;
    static int R, C;
    static Map<Character, Boolean> isVisited = new HashMap<>();
    static int max, count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        board = new char[R][C];

        for(int i = 0; i < R; i++) {
            String line = br.readLine();
            board[i] = line.toCharArray();
        }

        for(int i = 0; i < R; i++) {
            for(int j = 0; j < C; j++) {
                isVisited.put(board[i][j], false);
            }
        }

        DFS(0, 0);
        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void DFS(int row, int col) {
        if(!isVisited.get(board[row][col])) {
            count++;
            isVisited.put(board[row][col], true);
            if(0 <= row - 1 && canMove(row - 1, col)) {
                DFS(row - 1, col);
            }
            if(row + 1 < R && canMove(row + 1, col)) {
                DFS(row + 1, col);
            }
            if(0 <= col - 1 && canMove(row, col - 1)) {
                DFS(row, col - 1);
            }
            if(col + 1 < C && canMove(row, col + 1)) {
                DFS(row, col + 1);
            }
            isVisited.put(board[row][col], false);
        }
        max = Math.max(max, count);
        count--;
        return;
    }

    public static boolean canMove(int row, int col) {
        if(isVisited.get(board[row][col])) {
            return false;
        }
        return true;
    }
}
