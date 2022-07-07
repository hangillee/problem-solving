import java.io.*;

public class BOJ2448 {
    static char[][] stars;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int center = (2 * N - 1) / 2;
        stars = new char[N][N*2-1];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N*2-1; j++) {
                stars[i][j] = ' ';
            }
        }

        drawStar(0, center, N);

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N*2-1; j++) {
                bw.write(String.valueOf(stars[i][j]));
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    public static void drawStar(int x, int y, int N) {
        if(N == 3) {
            stars[x][y] = '*';
            stars[x+1][y-1] = stars[x+1][y+1] = '*';
            stars[x+2][y-2] = stars[x+2][y-1] = stars[x+2][y] = stars[x+2][y+1] = stars[x+2][y+2] = '*';
            return;
        }
        drawStar(x, y, N/2);
        drawStar(x + N/2, y - N/2, N/2);
        drawStar(x + N/2, y + N/2, N/2);
    }
}
