import java.io.*;
import java.util.StringTokenizer;

public class BOJ1783 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(N == 1) {
            bw.write("1");
            bw.flush();
        } else if (N == 2) {
            bw.write(String.valueOf(Math.min((M+1)/2, 4)));
            bw.flush();
        } else if (N >= 3) {
            if(M >= 7) {
                bw.write(String.valueOf(M-2));
                bw.flush();
            } else {
                bw.write(String.valueOf(Math.min(M, 4)));
                bw.flush();
            }
        }
        bw.close();
        br.close();
    }
}
