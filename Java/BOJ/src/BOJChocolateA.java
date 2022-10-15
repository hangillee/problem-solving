import java.io.*;
import java.util.StringTokenizer;

public class BOJChocolateA {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long R = Integer.parseInt(st.nextToken());
            long C = Integer.parseInt(st.nextToken());

            long whiteDown = 0L;
            long whiteUp = 0L;
            long blackVertical = 0L;
            long blackHorizontal = 0L;

            while(R * C > 0) {
                whiteDown += R * C;
                whiteUp += (R-1) * (C-1);
                blackVertical += (R-1) * C;
                blackHorizontal += R * (C-1);
                R--;
                C--;
            }
            long whiteResult = whiteDown + whiteUp;
            long blackResult = blackVertical + blackHorizontal;

            bw.write(whiteResult + " " + blackResult + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
