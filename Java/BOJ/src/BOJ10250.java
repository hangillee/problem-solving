import java.io.*;
import java.util.StringTokenizer;

public class BOJ10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int floor;
            int room;
            if(N % H == 0) {
                floor = H;
                room = N / H;
            } else {
                floor = N % H;
                room = N / H + 1;
            }

            bw.write((100 * floor + room) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
