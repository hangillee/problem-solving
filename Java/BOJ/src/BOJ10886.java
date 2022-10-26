import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class BOJ10886 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Map<Integer, Integer> opinions = new HashMap<>();
        opinions.put(0, 0);
        opinions.put(1, 0);

        for(int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            opinions.put(n, opinions.get(n) + 1);
        }

        if(opinions.get(0) > opinions.get(1)) {
            bw.write("Junhee is not cute!");
        } else {
            bw.write("Junhee is cute!");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
