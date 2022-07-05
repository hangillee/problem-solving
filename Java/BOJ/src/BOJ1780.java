import java.io.*;
import java.util.StringTokenizer;

public class BOJ1780 {
    static int countMinus = 0;
    static int countOne = 0;
    static int countZero = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] matrix = new int[N][N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        countPaper(matrix, 0, 0, N);

        StringBuilder sb = new StringBuilder();
        sb.append(countMinus + "\n").append(countZero + "\n").append(countOne + "\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static void countPaper(int[][] matrix, int x, int y, int num) {
        int current = matrix[x][y];
        boolean isSame = true;
        if(num == 1) {
            if(current == -1) {
                countMinus++;
                return;
            } else if(current == 0) {
                countZero++;
                return;
            } else {
                countOne++;
                return;
            }
        }

        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                if(matrix[x+i][y+j] != current) {
                    isSame = false;
                    break;
                }
            }
        }

        if(isSame) {
            if(current == -1) {
                countMinus++;
                return;
            } else if (current == 0) {
                countZero++;
                return;
            } else {
                countOne++;
                return;
            }
        } else {
            num /= 3;
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    countPaper(matrix, x+i*num, y+j*num, num);
                }
            }
        }
    }
}
