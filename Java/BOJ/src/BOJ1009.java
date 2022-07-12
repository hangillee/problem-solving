import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int a, b;

        StringTokenizer st;
        for(int i = 0 ; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            int result = 1;
            for(int j = 0; j < b; j++) {
                result = (result * a) % 10;
            }

            if(result == 0) {
                bw.write("10"+"\n");
                bw.flush();
            } else {
                bw.write(result + "\n");
                bw.flush();
            }
        }
        bw.close();
        br.close();
    }
}
