import java.io.*;

public class BOJ2447 {
    static char[][] stars;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        stars = new char[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                stars[i][j] = ' ';
            }
        }
        starDraw(0, 0, N);

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
               bw.write(String.valueOf(stars[i][j]));
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    public static void starDraw(int x, int y, int N) {
        if(N == 1) {
            stars[x][y] = '*';
            return;
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(!(i == 1 && j == 1)) {
                    starDraw(x+i*(N/3), y+j*(N/3), N/3);
                }
            }
        }
    }
}
