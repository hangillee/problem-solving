import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Integer[] points = new Integer[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < points.length; i++) {
            points[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(points);
        bw.write(String.valueOf(points[N-K]));
        bw.flush();
        bw.close();
        br.close();
    }
}
