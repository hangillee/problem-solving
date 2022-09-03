import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> queue = new ArrayList<>();

        for(int i = 1; i <= N; i++) {
            queue.add(i);
        }

        bw.write("<");
        int idx = 0;
        for(int i = 0; i < N; i++) {
            idx += (K - 1);
            if(idx >= queue.size()) {
                while(idx >= queue.size()) {
                    idx -= queue.size();
                }
            }
            if(queue.size() == 1) {
                bw.write(String.valueOf(queue.get(idx)));
            } else {
                bw.write(queue.get(idx) + ", ");
            }
            queue.remove(idx);

        }

        bw.write(">");
        bw.flush();
        bw.close();
        br.close();
    }
}
