import java.io.*;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class BOJ2166 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        long[][] matrix = new long[N+1][2];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        matrix[N][0] = matrix[0][0];
        matrix[N][1] = matrix[0][1];

        long first = 0;
        long second = 0;
        for(int i = 0; i < N; i++) {
            first += matrix[i][0] * matrix[i+1][1];
            second += matrix[i][1] * matrix[i+1][0];
        }

        String result = String.format("%.1f", (Math.abs(first - second) * 0.5));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
