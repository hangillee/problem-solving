import java.io.*;
import java.util.StringTokenizer;

public class BOJ25238 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int result = a * (100 - b) / 100;
        if(result >= 100) {
            bw.write("0");
        } else {
            bw.write("1");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
