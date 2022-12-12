import java.io.*;

public class BOJ6749 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int Y = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int diff = M - Y;
        bw.write(String.valueOf(M + diff));
        bw.flush();
        bw.close();
        br.close();
    }
}
