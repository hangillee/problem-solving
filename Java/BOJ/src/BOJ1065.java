import java.io.*;

public class BOJ1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if(i < 100) {
                cnt++;
            } else {
                int hundreds = i / 100;
                int tens = (i % 100) / 10;
                int units = (i % 100) % 10;
                if(hundreds - tens == tens - units) {
                    cnt++;
                }
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}
