import java.io.*;
import java.util.StringTokenizer;

public class BOJ2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        B += C;
        if((B / 60) != 0) {
            A += (B / 60);
            B = B % 60;
        }
        if(A >= 24) {
            A -= 24;
        }

        bw.write(A + " " + B);
        bw.flush();
        bw.close();
        br.close();
    }
}
