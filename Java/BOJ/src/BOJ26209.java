import java.io.*;
import java.util.StringTokenizer;

public class BOJ26209 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String result = "S";
        while(st.hasMoreTokens()) {
            int N = Integer.parseInt(st.nextToken());
            if(N == 9) {
                result = "F";
                break;
            }
        }
        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}
