import java.io.*;
import java.util.StringTokenizer;

public class BOJ14889 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static int[][] S;
    static boolean[] joined;
    static int minimumGap = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        S = new int[N][N];
        joined = new boolean[N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                S[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        teamBuilding(0, 0);
        bw.write(String.valueOf(minimumGap));
        bw.flush();
        bw.close();
        br.close();
    }

    static void teamBuilding(int member, int count) throws IOException {
        if(count == N / 2) {
            countGap();
            return;
        }
        for(int i = member; i < N; i++) {
            if(!joined[i]) {
                joined[i] = true;
                teamBuilding(i+1, count+1);
                joined[i] = false;
            }
        }
    }

    static void countGap() throws IOException {
        int teamStart = 0;
        int teamLink = 0;

        for(int i = 0; i < N-1; i++) {
            for(int j = i+1; j < N; j++) {
                if(joined[i] && joined[j]) {
                    teamStart += S[i][j];
                    teamStart += S[j][i];
                } else if (!joined[i] && !joined[j]) {
                    teamLink += S[i][j];
                    teamLink += S[j][i];
                }
            }
        }

        int gap = Math.abs(teamStart - teamLink);
        if(gap == 0) {
            bw.write(String.valueOf(gap));
            bw.flush();
            bw.close();
            br.close();
            System.exit(0);
        }

        minimumGap = Math.min(gap, minimumGap);
    }
}
