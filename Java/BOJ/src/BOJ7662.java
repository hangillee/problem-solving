import java.io.*;
import java.util.*;

public class BOJ7662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            TreeMap<Integer, Integer> dpq = new TreeMap<>();
            for(int j = 0; j < k; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                char command = st.nextToken().charAt(0);
                int num = Integer.parseInt(st.nextToken());
                if(command == 'I') {
                    dpq.put(num, dpq.getOrDefault(num, 0) + 1);
                } else if(command =='D') {
                    if(dpq.isEmpty()) {
                        continue;
                    }
                    int key = (num == 1) ? dpq.lastKey() : dpq.firstKey();
                    if(dpq.put(key, dpq.get(key) - 1) == 1) {
                        dpq.remove(key);
                    }
                }
            }
            if(dpq.isEmpty()) {
                bw.write("EMPTY\n");
            } else {
                bw.write(dpq.lastKey() + " " + dpq.firstKey() + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
