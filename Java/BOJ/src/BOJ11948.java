import java.io.*;
import java.util.Arrays;

public class BOJ11948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] pointsFour = new int[4];
        int[] pointsTwo = new int[2];
        for(int i = 0; i < 4; i++) {
            pointsFour[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < 2; i++) {
            pointsTwo[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(pointsFour);
        Arrays.sort(pointsTwo);
        int total = 0;
        for(int i = 1; i < 4; i++) {
            total += pointsFour[i];
        }
        total += pointsTwo[1];
        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
        br.close();
    }
}
