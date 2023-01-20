import java.io.*;

public class BOJ15873 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int A, B;
        if(N / 1000 == 1 || N / 100 != 0 && N % 10 == 0) {
            A = N / 100;
            B = N % 100;
        } else {
            A = N / 10;
            B = N % 10;
        }
        bw.write(String.valueOf(A + B));
        bw.flush();
        bw.close();
        br.close();
    }
}
