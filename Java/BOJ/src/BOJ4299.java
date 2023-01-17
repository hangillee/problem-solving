import java.io.*;
import java.util.StringTokenizer;

public class BOJ4299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());
        int gap = Integer.parseInt(st.nextToken());
        int A = (total + gap) / 2;
        int B = (total - gap) / 2;
        if((total + gap) % 2 != 0 || (total - gap) % 2 != 0 || total < gap) {
            bw.write("-1");
        } else {
            bw.write(A + " " + B);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
