import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ1773 {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final StringTokenizer st = new StringTokenizer(br.readLine());
        final int students = Integer.parseInt(st.nextToken());
        final int timeLength = Integer.parseInt(st.nextToken());
        final boolean[] seconds = new boolean[timeLength + 1];

        final int[] cycles = new int[students];

        for (int i = 0; i < cycles.length; i++) {
            cycles[i] = Integer.parseInt(br.readLine());
        }

        for (int cycle : cycles) {
            int count = 1;
            for (int j = 0; j < seconds.length; j++) {
                if (count * cycle >= seconds.length) {
                    break;
                }
                if (seconds[count * cycle]) {
                    count++;
                    continue;
                }
                seconds[count * cycle] = true;
                count++;
            }
        }

        int fireCount = 0;
        for (boolean second : seconds) {
            if (second) {
                fireCount++;
            }
        }

        bw.write(String.valueOf(fireCount));
        bw.flush();
        bw.close();
        br.close();
    }
}
