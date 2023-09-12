import java.io.*;
import java.util.PriorityQueue;

public class BOJ1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<Integer> remainSticks = new PriorityQueue<>();
        remainSticks.add(64);
        int X = Integer.parseInt(br.readLine());
        int sum;

        if (X != 64) {
            do {
                int stick = remainSticks.poll();
                int dividedStick = stick / 2;
                sum = remainSticks.stream().reduce(Integer::sum).orElse(0);
                if(sum + dividedStick >= X) {
                    remainSticks.add(dividedStick);
                } else {
                    for(int i = 0; i < 2; i++) {
                        remainSticks.add(dividedStick);
                    }
                }
                sum = remainSticks.stream().reduce(Integer::sum).orElse(0);
            } while (sum > X);
        }

        bw.write(String.valueOf(remainSticks.size()));
        bw.flush();
        br.close();
        bw.close();
    }
}
