import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] chessBoard = new char[N][M];
        String[] line = new String[N];
        int result = 33;

        for(int i = 0; i < N; i++) {
            line[i] = br.readLine();
            for (int j = 0; j < M; j++) {
                chessBoard[i][j] = line[i].toCharArray()[j];
            }
        }

        for (int i = 0; i < N - 7 ; i++) {
            for(int j = 0; j < M - 7; j++) {
                result = Math.min(result, checkBoard(i, j, chessBoard));
            }
        }

        System.out.println(result);
    }

    public static int checkBoard(int N, int M, char[][] chessBoard) {
        int white = 0;
        int black = 0;

        for(int i = N; i < N+8; i++) {
            for(int j = M; j < M+8; j++) {
                if((i + j) % 2 == 0) {
                    if(chessBoard[i][j] == 'B') {
                        white++;
                    } else {
                        black++;
                    }
                } else {
                    if(chessBoard[i][j] == 'W') {
                        white++;
                    } else {
                        black++;
                    }
                }
            }
        }

        return Math.min(black, white);
    }
}
