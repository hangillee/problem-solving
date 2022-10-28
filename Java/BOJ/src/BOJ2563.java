import java.io.*;
import java.util.StringTokenizer;

public class BOJ2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] white = new int[100][100];
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int blackCol = Integer.parseInt(st.nextToken());
            int blackRow = Integer.parseInt(st.nextToken());
            for(int j = blackRow; j < blackRow+10; j++) {
                for(int k = blackCol; k < blackCol+10; k++) {
                    if(white[j][k] == 1) {
                        continue;
                    }
                    white[j][k] = 1;
                    count++;
                }
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
