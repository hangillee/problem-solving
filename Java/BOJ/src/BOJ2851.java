import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2851 {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int[] mushrooms = new int[10];
        for (int i = 0; i < mushrooms.length; i++) {
            mushrooms[i] = Integer.parseInt(br.readLine());
        }

        int score = 0;
        for (int mushroom : mushrooms) {
            int currentScoreGap = Math.abs(100 - score);
            int nextScoreGap = Math.abs(100 - (score + mushroom));
            if (nextScoreGap > currentScoreGap) break;
            score += mushroom;
        }

        bw.write(String.valueOf(score));
        bw.flush();
        bw.close();
        br.close();
    }
}
