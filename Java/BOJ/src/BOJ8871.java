import java.io.*;

public class BOJ8871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        bw.write(((N + 1) * 2) + " " + ((N + 1) * 3));
        bw.flush();
        bw.close();
        br.close();
    }
}
