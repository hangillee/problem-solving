import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Integer> rotateQueue = new ArrayList<>();
        for(int i = 1; i <= N; i++) {
            rotateQueue.add(i);
        }

        int count = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            while(rotateQueue.get(0) != num) {
                count++;
                if(rotateQueue.indexOf(num) <= (rotateQueue.size() / 2)) {
                    rotateQueue.add(rotateQueue.size() - 1, rotateQueue.remove(0));
                } else {
                    rotateQueue.add(0, rotateQueue.remove(rotateQueue.size() - 1));
                }
            }
            rotateQueue.remove(0);
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
