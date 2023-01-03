import java.io.*;
import java.util.StringTokenizer;

public class BOJ5575 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startTime = 0;
            for(int j = 0; j < 3; j++) {
                startTime += Integer.parseInt(st.nextToken()) * (3600 / Math.pow(60, j));
            }
            int endTime = 0;
            for(int j = 0; j < 3; j++) {
                endTime += Integer.parseInt(st.nextToken()) * (3600 / Math.pow(60, j));
            }
            int workTime = endTime - startTime;
            bw.write((workTime / 3600) + " " + (workTime % 3600) / 60 + " " + (workTime % 3600) % 60 + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
