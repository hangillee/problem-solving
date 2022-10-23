import java.io.*;
import java.util.StringTokenizer;

public class BOJ5596 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = 0;
        while(st.hasMoreTokens()) {
            S += Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = 0;
        while(st.hasMoreTokens()) {
            T += Integer.parseInt(st.nextToken());
        }

        bw.write(String.valueOf(Math.max(S, T)));
        bw.flush();
        bw.close();
        br.close();
    }
}
