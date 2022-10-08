import java.io.*;
import java.util.StringTokenizer;

public class BOJ24736 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        for(int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            int totalScore = 0;
            totalScore += Integer.parseInt(st.nextToken()) * 6
                    + Integer.parseInt(st.nextToken()) * 3
                    + Integer.parseInt(st.nextToken()) * 2
                    + Integer.parseInt(st.nextToken())
                    + Integer.parseInt(st.nextToken()) * 2;
            bw.write(totalScore + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
