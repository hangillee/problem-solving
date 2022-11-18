import java.io.*;
import java.util.StringTokenizer;

public class BOJ13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        long[] roads = new long[N-1];
        long[] cities = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N - 1; i++) {
            roads[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            cities[i] = Long.parseLong(st.nextToken());
        }

        long totalPrice = 0L;
        long minPrice = cities[0];
        for(int i = 0; i < N-1; i++) {
            if(minPrice > cities[i]) {
                minPrice = cities[i];
            }
            totalPrice += minPrice * roads[i];
        }

        bw.write(String.valueOf(totalPrice));
        bw.flush();
        bw.close();
        br.close();
    }
}
