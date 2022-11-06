import java.io.*;
import java.util.StringTokenizer;

public class BOJ20254 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] scores = { 56, 24, 14, 6 };

        int result = 0;
        for(int i = 0; i < scores.length; i++) {
            result += Integer.parseInt(st.nextToken()) * scores[i];
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
