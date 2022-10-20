import java.io.*;

public class BOJ24568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int R = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());

        int total = R * 8 + S * 3;
        bw.write(String.valueOf(total - 28));
        bw.flush();
        bw.close();
        br.close();
    }
}
