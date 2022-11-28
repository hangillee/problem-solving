import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> meet = new HashMap<>();
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();
            if(A.equals("ChongChong") || B.equals("ChongChong")) {
                meet.put(A, 1);
                meet.put(B, 1);
            } else if(meet.getOrDefault(A, 0) == 1 || meet.getOrDefault(B, 0) == 1) {
                meet.put(A, 1);
                meet.put(B, 1);
            } else {
                meet.put(A, 0);
                meet.put(B, 0);
            }
        }

        int count = 0;
        for(int value : meet.values()) {
            count += value;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
