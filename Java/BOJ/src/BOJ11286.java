import java.io.*;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;

public class BOJ11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //절대값이 더 큰 값은 뒤로
                if (Math.abs(o1) > Math.abs(o2)) {
                    return Math.abs(o1) - Math.abs(o2);
                } else if (Math.abs(o1) == Math.abs(o2)) { //절대값이 같을 때
                    return o1 - o2; //원래 값이 더 큰게 뒤로
                } else {
                    return -1;
                }
            }
        });

        for(int i = 0; i < N; i++) {
            int command = Integer.parseInt(br.readLine());
            if(command == 0) {
                if(pq.isEmpty()) {
                    bw.write("0\n");
                } else {
                    bw.write(pq.poll() + "\n");
                }
            } else {
                pq.add(command);
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
