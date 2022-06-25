import java.io.*;
import java.util.StringTokenizer;

public class BOJ2004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        int fivePowerNum = findFivePower(N) - findFivePower(N-M) - findFivePower(M);
        int twoPowerNum = findTwoPower(N) - findTwoPower(N-M) - findTwoPower(M);

        bw.write(String.valueOf(Math.min(fivePowerNum, twoPowerNum)));
        bw.flush();
        bw.close();
        br.close();
    }

    public static int findFivePower(long N){
        int count = 0;
        while(N >= 5) {
            count += (N / 5);
            N /= 5;
        }
        return count;
    }

    public static int findTwoPower(long N) {
        int count = 0;
        while(N >= 2) {
            count += (N / 2);
            N /= 2;
        }
        return count;
    }
}
