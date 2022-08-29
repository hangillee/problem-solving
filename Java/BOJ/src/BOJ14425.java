import java.io.*;
import java.util.*;

public class BOJ14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        Set<String> strSet = new HashSet<>();
        for(int i = 0; i < N; i++) {
            strSet.add(br.readLine());
        }

        Map<String, Integer> targetStr = new HashMap<>();
        for(int i = 0; i < M; i++) {
            String str = br.readLine();
            if(targetStr.get(str) != null) {
                int count = targetStr.get(str);
                targetStr.put(str, ++count);
            } else {
                targetStr.put(str, 1);
            }
        }

        int totalSum = 0;
        for(String str : strSet) {
            if(targetStr.get(str) != null) {
                totalSum += targetStr.get(str);
            }
        }

        bw.write(String.valueOf(totalSum));
        bw.flush();
        bw.close();
        br.close();
    }
}
