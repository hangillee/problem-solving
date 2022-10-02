import java.io.*;
import java.util.StringTokenizer;

public class BOJ8370 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int businessRow = Integer.parseInt(st.nextToken());
        int businessCol = Integer.parseInt(st.nextToken());
        int economicRow = Integer.parseInt(st.nextToken());
        int economicCol = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf((businessRow * businessCol) + (economicRow * economicCol)));
        bw.flush();
        bw.close();
        br.close();
    }
}
