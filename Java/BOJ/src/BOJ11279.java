import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BOJ11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            int command = Integer.parseInt(br.readLine());
            if(pq.isEmpty() && command == 0) {
                bw.write("0\n");
            } else if (command == 0) {
                bw.write(pq.poll() + "\n");
            } else {
                pq.add(command);
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
