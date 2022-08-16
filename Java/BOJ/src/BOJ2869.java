import java.io.*;
import java.util.StringTokenizer;

public class BOJ2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int days;
        if((V - B) % (A - B) == 0) {
            days = (V - B) / (A - B);
        } else {
            days = ((V - B) / (A - B)) + 1;
        }

        bw.write(String.valueOf(days));
        bw.flush();
        bw.close();
        br.close();
    }
}
