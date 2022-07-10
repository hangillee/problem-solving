import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ5014 {
    static boolean[] isVisited;
    static int F, S, G, U, D, depth;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        F = Integer.parseInt(st.nextToken()); //전체 층
        S = Integer.parseInt(st.nextToken()); //현재 층
        G = Integer.parseInt(st.nextToken()); //목표 층
        U = Integer.parseInt(st.nextToken()); //상승 버튼
        D = Integer.parseInt(st.nextToken()); //하강 버튼

        isVisited = new boolean[F+1];

        BFS(S);

        if(isVisited[G]) {
            bw.write(String.valueOf(depth));
            bw.flush();
        } else {
            bw.write("use the stairs");
            bw.flush();
        }
    }

    public static void BFS(int current) {
        depth = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(current);
        isVisited[current] = true;

        while(!queue.isEmpty()) {
            int currentDepthLen = queue.size();
            for(int i = 0; i < currentDepthLen; i++) {
                int currentLevel = queue.poll();
                if(currentLevel == G) {
                    return;
                }
                if(1 <= currentLevel - D && !isVisited[currentLevel - D]) {
                    queue.offer(currentLevel - D);
                    isVisited[currentLevel - D] = true;
                }
                if(currentLevel + U <= F && !isVisited[currentLevel + U]) {
                    queue.offer(currentLevel + U);
                    isVisited[currentLevel + U] = true;
                }
            }
            depth++;
        }
    }
}
