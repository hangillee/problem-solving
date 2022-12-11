import java.io.*;
import java.util.StringTokenizer;

public class BOJ11943 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A1 = Integer.parseInt(st.nextToken());
        int O1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int A2 = Integer.parseInt(st.nextToken());
        int O2 = Integer.parseInt(st.nextToken());

        if(A1 + O2 < A2 + O1) {
            bw.write(String.valueOf(A1 + O2));
        } else {
            bw.write(String.valueOf(A2 + O1));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
