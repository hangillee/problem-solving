import java.io.*;
import java.util.StringTokenizer;

public class BOJ1074 {
    static int position = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        divide(N, r, c);
        bw.write(String.valueOf(position));
        bw.flush();
        bw.close();
        br.close();
    }

    static void divide(int N, int r, int c) {
        int center = (int) Math.pow(2, N-1);

        if(N > 1) {
            if(r < center && c < center) {
                divide(N - 1, r, c);
            } else if (r < center && c >= center) {
                position += (int) Math.pow(4, N-1);
                divide(N - 1, r, c - center);
            } else if (r >= center && c < center) {
                position += 2 * (int) Math.pow(4, N-1);
                divide(N - 1, r - center, c);
            } else {
                position += 3 * (int) Math.pow(4, N-1);
                divide(N - 1, r - center, c - center);
            }
        } else {
            position += (2 * r + c);
            return;
        }
    }
}
