import java.io.*;

public class BOJ26574 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            bw.write(num + " " + num + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}