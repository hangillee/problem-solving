import java.io.*;
import java.util.*;

public class BOJ10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> hashCards = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int key = Integer.parseInt(st.nextToken());
            hashCards.put(key, hashCards.getOrDefault(key, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            int key = Integer.parseInt(st.nextToken());
            sb.append(hashCards.getOrDefault(key, 0) + " ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
