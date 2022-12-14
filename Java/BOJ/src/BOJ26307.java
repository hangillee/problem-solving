import java.io.*;
import java.util.StringTokenizer;

public class BOJ26307 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hours = Integer.parseInt(st.nextToken());
        int minutes = Integer.parseInt(st.nextToken());
        int totalMins = (hours - 9) * 60 + minutes;
        bw.write(String.valueOf(totalMins));
        bw.flush();
        bw.close();
        br.close();
    }
}
