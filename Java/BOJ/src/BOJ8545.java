import java.io.*;

public class BOJ8545 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String target = br.readLine();

        for(int i = target.length() - 1; i >= 0; i--) {
            bw.write(String.valueOf(target.charAt(i)));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
