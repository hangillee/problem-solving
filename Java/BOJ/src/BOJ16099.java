import java.io.*;
import java.util.StringTokenizer;

public class BOJ16099 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long tptLength = Long.parseLong(st.nextToken());
            long tptWidth = Long.parseLong(st.nextToken());
            long ecLength = Long.parseLong(st.nextToken());
            long ecWidth = Long.parseLong(st.nextToken());
            if(tptLength * tptWidth > ecLength * ecWidth) {
                bw.write("TelecomParisTech\n");
            } else if (tptLength * tptWidth < ecLength * ecWidth) {
                bw.write("Eurecom\n");
            } else {
                bw.write("Tie\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
