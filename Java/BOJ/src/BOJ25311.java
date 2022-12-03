import java.io.*;

public class BOJ25311 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(br.readLine());
        bw.write("A");
        bw.flush();
        bw.close();
        br.close();
    }
}
