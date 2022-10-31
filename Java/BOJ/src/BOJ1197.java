import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ1197 {
    static int[] parent;
    static List<Node> graph = new ArrayList<>();
    static List<Node> mst = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        parent = new int[V+1];
        for(int i = 1; i <= V; i++) {
            parent[i] = i;
        }

        int A, B, C;
        for(int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            buildGraph(A, B, C);
        }
        graph.sort(Comparator.comparingInt(n -> n.weight));
        kruskal(V);

        int total = 0;
        for(int i = 0; i < mst.size(); i++) {
            total += mst.get(i).weight;
        }
        bw.write(String.valueOf(total));
        bw.close();
        br.close();
    }

    static void buildGraph(int A, int B, int C) {
        Node node = new Node(A, B, C);
        graph.add(node);
    }

    //Union-Find
    static int find(int x) {
        if(parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }

    static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if(x != y) {
            parent[y] = x;
        }
    }

    //Kruskal
    static void kruskal(int V) {
        for(int i = 0; i < graph.size(); i++) {
            Node currentNode = graph.get(i);
            int start = currentNode.start;
            int end = currentNode.end;

            if(find(start) == find(end)) {
                continue;
            }

            mst.add(currentNode);
            union(start, end);

            if(mst.size() == V - 1) {
                return;
            }
        }
    }

    static class Node {
        int start;
        int end;
        int weight;

        public Node(int start, int end, int weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }
    }
}
