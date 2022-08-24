import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ2606 {
    private static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        boolean[] isVisited = new boolean[N+1];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0; i <= N; i++) {
            graph.add(i, new ArrayList<>());
        }

        for(int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            graph.get(parent).add(child);
            graph.get(child).add(parent);
        }

        DFS(1, isVisited, graph);
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }

    static void DFS(int node, boolean[] isVisited, ArrayList<ArrayList<Integer>> graph) {
        isVisited[node] = true;

        for(int i = 0; i < graph.get(node).size(); i++) {
            if(!isVisited[graph.get(node).get(i)]) {
                DFS(graph.get(node).get(i), isVisited, graph);
                count++;
            }
        }
    }
}
