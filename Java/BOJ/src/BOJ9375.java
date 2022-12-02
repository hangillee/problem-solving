import java.io.*;
import java.util.*;

public class BOJ9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            HashMap<String, Integer> clothes = new HashMap<>();
            int N = Integer.parseInt(br.readLine());
            for(int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String clothesName = st.nextToken();
                String clothesType = st.nextToken();
                clothes.put(clothesType, clothes.getOrDefault(clothesType, 0) + 1);
            }
            int result = 1;
            for(int j : clothes.values()) {
                result *= (j + 1);
            }
            bw.write(result - 1 + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
        br.close();
    }
}
