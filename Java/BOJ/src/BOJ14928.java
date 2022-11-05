import java.io.*;

public class BOJ14928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        int result = 0;
        for(int i = 0; i < N.length(); i++) {
            result = (result * 10 + (N.charAt(i) - '0')) % 20000303;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
