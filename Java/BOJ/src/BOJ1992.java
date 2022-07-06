import java.io.*;

public class BOJ1992 {
    static int[][] matrix;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        matrix = new int[N][N];

        for(int i = 0; i < N; i++) {
            String line = br.readLine();
            for(int j = 0; j < N; j++) {
                matrix[i][j] = line.charAt(j) - '0';
            }
        }

        quadTree(0, 0, N);
    }

    public static void quadTree(int x, int y, int N) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int currentValue = matrix[x][y];
        boolean isChanged = false;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(matrix[x+i][y+j] != currentValue) {
                    isChanged = true;
                    break;
                }
            }
        }

        if(isChanged) {
            bw.write("(");
            bw.flush();
            N /= 2;
            for(int i = 0; i < 2; i++) {
                for(int j = 0; j < 2; j++) {
                    quadTree(x+i*N, y+j*N, N);
                }
            }
            bw.write(")");
            bw.flush();
        } else {
            if(currentValue == 1) {
                bw.write("1");
                bw.flush();
            } else if(currentValue == 0) {
                bw.write("0");
                bw.flush();
            }
        }
    }
}
