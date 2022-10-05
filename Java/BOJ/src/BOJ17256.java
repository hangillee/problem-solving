import java.io.*;
import java.util.StringTokenizer;

public class BOJ17256 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] a = new int[3];
        for(int i = 0; i < 3; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int[] c = new int[3];
        for(int i = 0; i < 3; i++) {
            c[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(c[0] - a[2] + " ");
        bw.write(c[1] / a[1] + " ");
        bw.write(String.valueOf(c[2] - a[0]));
        bw.flush();
        bw.close();
        br.close();
    }
}
