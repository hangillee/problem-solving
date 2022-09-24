import java.io.*;

public class BOJ20492 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        bw.write((int)(N - N * 0.22) + "\n");
        bw.write((int)(N - (N * 0.2 * 0.22)) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
