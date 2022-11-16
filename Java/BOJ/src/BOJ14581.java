import java.io.*;

public class BOJ14581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String id = br.readLine();
        bw.write(":fan::fan::fan:\n" +
                ":fan::" + id + "::fan:\n" +
                ":fan::fan::fan:");
        bw.flush();
        bw.close();
        br.close();
    }
}
