import java.io.*;
import java.util.*;

public class BOJ2887 {
    static int[] parent;
    static List<Edge> edges;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Node[] nodes = new Node[N];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            nodes[i] = new Node(i, x, y, z);
        }

        edges = new ArrayList<>();

        Arrays.sort(nodes, Comparator.comparingInt(n -> n.x));
        for(int i = 0; i < N-1; i++) {
            int weight = Math.abs(nodes[i].x - nodes[i+1].x);
            edges.add(new Edge(nodes[i].position, nodes[i+1].position, weight));
        }

        Arrays.sort(nodes, Comparator.comparingInt(n -> n.y));
        for(int i = 0; i < N-1; i++) {
            int weight = Math.abs(nodes[i].y - nodes[i+1].y);
            edges.add(new Edge(nodes[i].position, nodes[i+1].position, weight));
        }

        Arrays.sort(nodes, Comparator.comparingInt(n -> n.z));
        for(int i = 0; i < N-1; i++) {
            int weight = Math.abs(nodes[i].z - nodes[i+1].z);
            edges.add(new Edge(nodes[i].position, nodes[i+1].position, weight));
        }

        init(N);
        Collections.sort(edges);

        bw.write(String.valueOf(kruskal()));
        bw.flush();
        bw.close();
        br.close();
    }

    static void init(int N) {
        parent = new int[N];
        for(int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
    }

    static int find(int n) {
        if(parent[n] == n) {
            return n;
        }
        return parent[n] = find(parent[n]);
    }

    static void union(int n1, int n2) {
        n1 = find(n1);
        n2 = find(n2);

        if(n1 != n2) {
            parent[n2] = n1;
        }
    }

    static int kruskal() {
        int result = 0;

        for(int i = 0; i < edges.size(); i++) {
            Edge currentEdge = edges.get(i);
            if(find(currentEdge.start) == find(currentEdge.end)) {
                continue;
            }

            result += currentEdge.weight;
            union(currentEdge.start, currentEdge.end);
        }

        return result;
    }

    static class Node {
        int position;
        int x;
        int y;
        int z;

        Node(int position, int x, int y, int z) {
            this.position = position;
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    static class Edge implements Comparable<Edge> {
        int start;
        int end;
        int weight;

        Edge(int start, int end, int weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return weight - o.weight;
        }
    }
}