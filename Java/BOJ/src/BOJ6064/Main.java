package BOJ6064;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;

            boolean found = false;

            for (int j = x; j < (M * N); j += M) {
                if (j % N == y) {
                    bw.write(String.valueOf(j + 1) + "\n");
                    found = true;
                    break;
                }
            }

            if (!found) {
                bw.write("-1\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
