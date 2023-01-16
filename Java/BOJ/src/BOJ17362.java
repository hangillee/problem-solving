import java.io.*;

public class BOJ17362 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()) % 8;
        bw.write(String.valueOf(N > 5 || N == 0 ? (10 - N) % 8 : N));
        bw.flush();
        bw.close();
        br.close();
    }
}
