import java.io.*;
import java.util.StringTokenizer;

public class BOJ10025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] position = new int[1000001];

        int maxPos = 0;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int ice = Integer.parseInt(st.nextToken());
            int pos = Integer.parseInt(st.nextToken());
            position[pos] = ice;
            maxPos = Math.max(pos, maxPos);
        }

        int iceSum = 0;
        int maxIce = 0;
        for(int i = 0; i <= maxPos; i++) {
            if(i >= K*2+1) {
                iceSum -= position[i-(K*2+1)];
            }
            iceSum += position[i];
            maxIce = Math.max(iceSum, maxIce);
        }

        bw.write(String.valueOf(maxIce));
        bw.flush();
        bw.close();
        br.close();
    }
}
