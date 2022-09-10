import java.io.*;
import java.util.PriorityQueue;

public class BOJ1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < N; i++) {
            int command = Integer.parseInt(br.readLine());
            if(command == 0) {
                if(pq.isEmpty()) {
                    bw.write("0\n");
                    continue;
                }
                bw.write(pq.poll() + "\n");
            } else {
                pq.add(command);
            }
        }

        bw.flush();
        bw.close();
    }
}
