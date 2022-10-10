import java.io.*;
import java.util.StringTokenizer;

public class BOJ2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hours = 3600 * Integer.parseInt(st.nextToken());
        int minutes = 60 * Integer.parseInt(st.nextToken());
        int seconds = Integer.parseInt(st.nextToken());
        int totalSeconds = hours + minutes + seconds + Integer.parseInt(br.readLine());

        bw.write((totalSeconds / 3600) % 24 + " " + (totalSeconds % 3600) / 60 + " " + (totalSeconds % 3600) % 60);
        bw.flush();
        bw.close();
    }
}
