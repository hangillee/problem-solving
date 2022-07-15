import java.io.*;
import java.util.StringTokenizer;

public class BOJ2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int reward = 0;
        if(A == B && B == C) {
            reward = 10000 + (A * 1000);
        } else if (A == B || B == C || C == A) {
            if(A == B) {
                reward = 1000 + (A * 100);
            } else if (B == C) {
                reward = 1000 + (B * 100);
            } else {
                reward = 1000 + (C * 100);
            }
        } else {
            reward = A;
            if(reward <= B) {
                reward = B;
            }
            if (reward <= C) {
                reward = C;
            }
            reward *= 100;
        }

        bw.write(String.valueOf(reward));
        bw.flush();
        bw.close();
        br.close();
    }
}
