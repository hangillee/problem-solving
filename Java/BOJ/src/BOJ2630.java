import java.io.*;
import java.util.StringTokenizer;

public class BOJ2630 {
    static int blueCount = 0;
    static int whiteCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] paper = new int[N][N];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dnq(paper, 0, 0, N);
        bw.write(whiteCount + "\n" + blueCount);
        bw.flush();
        bw.close();
        br.close();
    }

    static void dnq(int[][] paper, int rowStart, int colStart, int size) {
        if(size == 1) {
            if(paper[rowStart][colStart] == 1) {
                blueCount++;
            } else {
                whiteCount++;
            }
            return;
        }

        int count = 0;
        for(int i = rowStart; i < rowStart + size; i++) {
            for(int j = colStart; j < colStart + size; j++) {
                count += paper[i][j];
            }
        }

        if (count == size * size) {
            blueCount++;
        } else if(count == 0) {
            whiteCount++;
        } else {
            dnq(paper, rowStart, colStart, size / 2);
            dnq(paper, rowStart, colStart + size / 2, size / 2);
            dnq(paper, rowStart + size / 2, colStart, size / 2);
            dnq(paper, rowStart + size / 2, colStart + size / 2, size / 2);
        }
    }
}
