import java.io.*;
import java.util.StringTokenizer;

public class BOJ1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            int distance = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
            int radiusSum = (r2 + r1) * (r2 + r1);
            int radiusSub = (r2 - r1) * (r2 - r1);

            if(distance == 0 && radiusSub == 0) {
                bw.write("-1\n");
            } else if(radiusSub < distance && distance < radiusSum) {
                bw.write("2\n");
            } else if(distance == radiusSum || distance == radiusSub) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
