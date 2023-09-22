import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] solutions = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            solutions[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(solutions);

        int minimumGap = Integer.MAX_VALUE;
        int frontResult = 0;
        int backResult = 0;
        int frontIndex = 0;
        int backIndex = N - 1;

        while(frontIndex < backIndex) {
            int gapFromZero = solutions[frontIndex] + solutions[backIndex];
            if(Math.abs(minimumGap) > Math.abs(gapFromZero)) {
                minimumGap = gapFromZero;
                frontResult = solutions[frontIndex];
                backResult = solutions[backIndex];
            }
            if(gapFromZero == 0) {
                break;
            } else if(gapFromZero > 0) {
                backIndex--;
            } else {
                frontIndex++;
            }
        }

        bw.write(frontResult + " " + backResult);
        bw.flush();
        bw.close();
        br.close();
    }
}
