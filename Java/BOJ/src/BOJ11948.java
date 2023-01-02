import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ11948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] points = new int[6];
        for(int i = 0; i < 6; i++) {
            points[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(points);
        int total = 0;
        for(int i = 5; i > 1; i--) {
            total += points[i];
        }
        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
        br.close();
    }
}
