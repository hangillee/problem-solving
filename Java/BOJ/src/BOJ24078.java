import java.io.*;

public class BOJ24078 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int X = Integer.parseInt(br.readLine()) % 21;
        bw.write(String.valueOf(X));
        bw.flush();
        bw.close();
        br.close();
    }
}
