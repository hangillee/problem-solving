import java.io.*;
import java.util.Arrays;

public class BOJ18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] opinions = new int[n];
        for(int i = 0; i < n; i++) {
            opinions[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(opinions);
        int limit = (int) Math.round(n * 0.15);
        for(int i = 0; i < limit; i++) {
            opinions[0] = 0;
            opinions[opinions.length-1] = 0;
        }
        int opinionSum = 0;
        for (int i = limit; i < opinions.length - limit; i++) {
            opinionSum += opinions[i];
        }
        int average = Math.round((float) opinionSum / (n - limit * 2));
        bw.write(String.valueOf(average));
        bw.flush();
        bw.close();
        br.close();
    }
}
