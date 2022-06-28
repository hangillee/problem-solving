import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ10451 {
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] isVisited;
    static int countCycle = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++) {
            int N = Integer.parseInt(br.readLine());
            isVisited = new boolean[N+1];
            countCycle = 0;

            graph = new ArrayList<>();
            for(int j = 0; j <= N; j++) {
                graph.add(new ArrayList<>());
            }

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= N; j++) {
                graph.get(j).add(Integer.parseInt(st.nextToken()));
            }

            for(int j = 1; j <= N; j++) {
                if(!isVisited[j]) {
                    DFS(j);
                }
            }

            bw.write(countCycle + "\n");
            bw.flush();
        }
        bw.close();
        br.close();
    }

    public static void DFS(int N) {
        isVisited[N] = true;

        for(int i = 0; i < graph.get(N).size(); i++) {
            if(!isVisited[graph.get(N).get(i)]) {
                DFS(graph.get(N).get(i));
            } else {
                countCycle++;
                return;
            }
        }
    }
}
