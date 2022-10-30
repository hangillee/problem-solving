import java.io.*;

public class BOJ16486 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int d1 = Integer.parseInt(br.readLine());
        int d2 = Integer.parseInt(br.readLine());
        double result = (d1 * 2) + (2 * 3.141592 * d2);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
