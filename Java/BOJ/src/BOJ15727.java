import java.io.*;

public class BOJ15727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int L = Integer.parseInt(br.readLine());
        int min = 0;
        for(int i = 5; i > 0; i--) {
            min += L / i;
            L %= i;
        }
        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
        br.close();
    }
}
