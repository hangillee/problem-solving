import java.io.*;
import java.util.StringTokenizer;

public class BOJ10971 {
    static int N;
    static int[][] map;
    static boolean[] isVisited;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        isVisited = new boolean[N];

        StringTokenizer st;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < N; i++) {
            isVisited[i] = true;
            TSP(i, i, 0, 0);
            isVisited[i] = false;
        }

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void TSP(int start, int now, int cost, int cities) {
        if(cities == N-1) {
            if(map[now][start] != 0) {
                cost += map[now][start];
                min = Math.min(min, cost);
            }
        }
        for(int i = 0; i < N; i++) {
            if(!isVisited[i] && map[now][i] != 0) {
                isVisited[i] = true;
                TSP(start, i, cost + map[now][i], cities+1);
                isVisited[i] = false;
            }
        }
    }
}
