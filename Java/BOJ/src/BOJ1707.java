import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ1707 {
    static int[] colors;
    static boolean isBipartite;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            colors = new int[V+1];
            isBipartite = true;

            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

            for(int j = 0; j <= V; j++) {
                graph.add(new ArrayList<>());
                colors[j] = 0;
            }

            for(int j = 0; j < E; j++) {
                st = new StringTokenizer(br.readLine());
                int nodeU = Integer.parseInt(st.nextToken());
                int nodeV = Integer.parseInt(st.nextToken());

                graph.get(nodeU).add(nodeV);
                graph.get(nodeV).add(nodeU);
            }

            for(int j = 1; j <= V; j++) {
                if(!isBipartite) {
                    break;
                }
                if(colors[j] == 0) {
                    DFS(j, graph, 1);
                }
            }

            if(isBipartite) {
                bw.write("YES\n");
                bw.flush();
            } else {
                bw.write("NO\n");
                bw.flush();
            }
        }
        bw.close();
        br.close();
    }

    public static void DFS(int startNode, ArrayList<ArrayList<Integer>> graph, int color) {
        colors[startNode] = color;

        for(int i = 0; i < graph.get(startNode).size(); i++) {
            if(colors[graph.get(startNode).get(i)] == color) {
                isBipartite = false;
                return;
            }
            if(colors[graph.get(startNode).get(i)] == 0) {
                DFS(graph.get(startNode).get(i), graph, -color);
            }
        }
    }
}
