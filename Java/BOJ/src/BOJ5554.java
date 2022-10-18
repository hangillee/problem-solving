import java.io.*;

public class BOJ5554 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int totalSeconds = 0;

        for(int i = 0; i < 4; i++) {
            totalSeconds += Integer.parseInt(br.readLine());
        }

        bw.write((totalSeconds / 60) + "\n");
        bw.write((totalSeconds % 60) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
