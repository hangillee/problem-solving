import java.io.*;

public class BOJ17295 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String spoiler = br.readLine();
        bw.write("Avengers: Endgame");
        bw.flush();
        bw.close();
        br.close();
    }
}
