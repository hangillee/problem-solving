import java.io.*;
import java.util.StringTokenizer;

public class BOJ2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] matrix = new int[9][9];
        for(int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int maxValue = 0;
        int maxRow = 0;
        int maxCol = 0;
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(maxValue < matrix[i][j]) {
                    maxValue = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        bw.write(maxValue + "\n");
        bw.write((maxRow+1) + " " + (maxCol+1));

        bw.flush();
        bw.close();
        br.close();
    }
}
