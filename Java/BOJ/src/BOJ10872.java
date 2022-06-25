import java.io.*;

public class BOJ10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int facto = 1;

        for(int i = 2; i <= N; i++) {
            facto *= i;
        }

        bw.write(String.valueOf(facto));
        bw.flush();
        bw.close();
        br.close();
    }
}
