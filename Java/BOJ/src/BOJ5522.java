import java.io.*;

public class BOJ5522 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalScore = 0;
        for(int i = 0; i < 5; i++) {
            totalScore += Integer.parseInt(br.readLine());
        }

        bw.write(String.valueOf(totalScore));
        bw.flush();
        bw.close();
        br.close();
    }
}
