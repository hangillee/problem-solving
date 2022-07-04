import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2110 {
    static Integer[] coordinate;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        coordinate = new Integer[N];

        for(int i = 0; i < N; i++) {
            coordinate[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(coordinate);

        int start = 1;
        int end = coordinate[N-1] - coordinate[0] + 1;
        int mid;

        while(start < end) {
            mid = (start + end) / 2;
            if(isPossible(mid) < C) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        bw.write(String.valueOf(start-1));
        bw.flush();
        bw.close();
        br.close();
    }

    public static int isPossible(int dist) {
        int count = 1;
        int lastCoord = coordinate[0];

        for(int i = 1; i < coordinate.length; i++) {
            int currentCoord = coordinate[i];
            if(currentCoord - lastCoord >= dist) {
                count++;
                lastCoord = currentCoord;
            }
        }
        return count;
    }
}
