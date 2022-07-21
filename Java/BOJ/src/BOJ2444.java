import java.io.*;

public class BOJ2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i < N; i++) {
            for(int j = 0; j < N-i; j++) {
                bw.write(" ");
            }
            for(int j = 0; j < 2*i-1; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j < i; j++) {
                bw.write(" ");
            }
            for(int j = 2*N-(i*2-1); j > 0; j--) {
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
