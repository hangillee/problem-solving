import java.io.*;
import java.util.StringTokenizer;

public class BOJ25306 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        bw.write(String.valueOf(getExclusive(A-1) ^ getExclusive(B)));
        bw.flush();
        bw.close();
        br.close();
    }

    private static long getExclusive(long num) {
        long remainder = num % 4;
        if(remainder == 0) {
            return num;
        } else if (remainder == 1) {
            return 1L;
        } else if (remainder == 2) {
            return num + 1;
        } else {
            return 0L;
        }
    }
}
