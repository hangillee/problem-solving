import java.io.*;
import java.util.StringTokenizer;

public class BOJ18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[][] ground = new int[N][M];

        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < ground.length; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < ground[i].length; j++) {
                ground[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, ground[i][j]);
                min = Math.min(min, ground[i][j]);
            }
        }

        int answerTime = Integer.MAX_VALUE;
        int answerHeight = 0;

        for(int i = min; i <= max; i++) {
            int time = 0;
            int blocks = B;
            for(int j = 0; j < N; j++) {
                for(int k = 0; k < M; k++) {
                    if(ground[j][k] > i) {
                        time += Math.abs(ground[j][k] - i) * 2;
                        blocks += Math.abs(ground[j][k] - i);
                    } else if(ground[j][k] < i) {
                        time += Math.abs(ground[j][k] - i);
                        blocks -= Math.abs(ground[j][k] - i);
                    }
                }
            }

            if(blocks >= 0) {
                if(time <= answerTime) {
                    answerTime = time;
                    answerHeight = i;
                }
            }
        }

        bw.write(answerTime + " " + answerHeight);
        bw.flush();
        bw.close();
        br.close();
    }
}
