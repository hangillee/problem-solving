import java.io.*;

public class BOJ24082 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int X = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(X * X * X));
        bw.flush();
        bw.close();
    }
}
