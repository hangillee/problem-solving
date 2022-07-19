import java.io.*;
import java.util.StringTokenizer;

public class BOJ1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int yCost = 0;
        int mCost = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] callTimeArr = new int[N];
        for(int i = 0; i < N; i++) {
            callTimeArr[i] = Integer.parseInt(st.nextToken());
        }

        int currentTime;
        for(int i = 0; i < N; i++) {
            currentTime = callTimeArr[i];
            while(currentTime >= 0) {
                yCost += 10;
                currentTime -= 30;
            }
        }

        for(int i = 0; i < N; i++) {
            currentTime = callTimeArr[i];
            while(currentTime >= 0) {
                mCost += 15;
                currentTime -= 60;
            }
        }

        if(yCost < mCost) {
            bw.write("Y " + yCost);
            bw.flush();
        } else if(yCost == mCost) {
            bw.write("Y M " + yCost);
            bw.flush();
        } else {
            bw.write("M " + mCost);
            bw.flush();
        }
    }
}
