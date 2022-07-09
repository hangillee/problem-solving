import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1697 {
    static boolean[] isVisited;
    static int depth = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        isVisited = new boolean[100001];
        int result = BFS(N, M);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }

    public static int BFS(int N, int M) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(N);

        if(N == M) {
            return 0;
        }

        while(!queue.isEmpty()) {
            depth++;
            int queueSize = queue.size();
            for(int i = 0; i < queueSize; i++) {
                int targetNode = queue.poll();
                isVisited[targetNode] = true;
                if((0 <= targetNode-1 && targetNode-1 <= 100000) && !isVisited[targetNode - 1]) {
                    if(targetNode - 1 == M) {
                        return depth;
                    }
                    queue.offer(targetNode - 1);
                }
                if((0 <= targetNode+1 && targetNode+1 <= 100000) && !isVisited[targetNode + 1]) {
                    if(targetNode + 1 == M) {
                        return depth;
                    }
                    queue.offer(targetNode + 1);
                }
                if((0 <= targetNode*2 && targetNode*2 <= 100000) && !isVisited[targetNode * 2]) {
                    if(targetNode * 2 == M) {
                        return depth;
                    }
                    queue.offer(targetNode * 2);
                }
            }
        }
        return depth;
    }
}
