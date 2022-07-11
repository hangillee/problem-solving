import java.io.*;
import java.util.StringTokenizer;

public class BOJ2580 {
    static int[][] sudoku = new int[9][9];
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++) {
                sudoku[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        DFS(0, 0);
    }

    public static void DFS(int row, int col) throws IOException {
        if(col == 9) {
            DFS(row + 1, 0);
            return;
        }

        if(row == 9) {
            for(int i = 0; i < 9; i++) {
                for(int j = 0; j < 9; j++) {
                    bw.write(sudoku[i][j] + " ");
                    bw.flush();
                }
                bw.write("\n");
                bw.flush();
            }
            System.exit(0);
        }

        if(sudoku[row][col] == 0) {
            for(int i = 1; i <= 9; i++) {
                if(checkValid(row, col, i)) {
                    sudoku[row][col] = i;
                    DFS(row, col + 1);
                }
            }
            sudoku[row][col] = 0;
            return;
        }

        DFS(row, col + 1);
    }

    public static boolean checkValid(int row, int col, int value) {
        for(int i = 0; i < 9; i++) {
            if(sudoku[row][i] == value) {
                return false;
            }
        }

        for(int i = 0 ; i < 9; i++) {
            if(sudoku[i][col] == value) {
                return false;
            }
        }

        int firstRow = (row / 3) * 3;
        int firstCol = (col / 3) * 3;
        for(int i = firstRow; i < firstRow + 3; i++) {
            for(int j = firstCol; j < firstCol + 3; j++) {
                if(sudoku[i][j] == value) {
                    return false;
                }
            }
        }
        return true;
    }
}
