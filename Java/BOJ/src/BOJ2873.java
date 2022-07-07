import java.io.*;
import java.util.StringTokenizer;

public class BOJ2873 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int year = 1;
        while(true) {
            if((year-E) % 15 == 0 && (year-S) % 28 == 0 && (year-M) % 19 == 0) {
                bw.write(String.valueOf(year));
                bw.flush();
                break;
            }
            year++;
        }
    }
}
