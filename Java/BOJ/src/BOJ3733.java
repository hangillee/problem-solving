import java.io.*;
import java.util.StringTokenizer;

public class BOJ3733 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nums;
        while((nums = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(nums);
            int N = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            int x = S / (N + 1);
            bw.write(x + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
