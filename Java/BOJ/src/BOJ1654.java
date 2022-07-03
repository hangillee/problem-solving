import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1654 {
    static Integer[] lanList;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        lanList = new Integer[K];
        for(int i = 0; i < K; i++) {
            lanList[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(lanList);
        long maxLen = lanList[K-1];

        long bestLan = cutLan(1, maxLen+1, N);
        bw.write(String.valueOf(bestLan - 1));
        bw.flush();
    }

    public static long cutLan(long start, long end, int N) {
        long mid;
        while(start < end) {
            mid = (start + end) / 2;
            int sum = 0;
            for(int i = 0; i < lanList.length; i++) {
                sum += lanList[i] / mid;
            }
            if(sum < N) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
