import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ1753 {
    private static ArrayList<ArrayList<Node>> graph;
    private static int[] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());

        graph = new ArrayList<>();
        distance = new int[V + 1];

        for(int i = 0; i <= V; i++) {
            graph.add(i, new ArrayList<>());
        }
        Arrays.fill(distance, Integer.MAX_VALUE);

        for(int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int root = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            graph.get(root).add(new Node(child, weight));
        }

        dijkstraBFS(V, K);
        for(int i = 1; i <= V; i++) {
            if(distance[i] == Integer.MAX_VALUE) {
                bw.write("INF\n");
            } else {
                bw.write(distance[i] + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static void dijkstraBFS(int V, int K) {
        PriorityQueue<Node> queue = new PriorityQueue<>();
        boolean[] isVisited = new boolean[V + 1];
        queue.add(new Node(K, 0));
        distance[K] = 0;

        while(!queue.isEmpty()) {
            Node currentNode = queue.poll();
            if(isVisited[currentNode.child]) {
                continue;
            }
            isVisited[currentNode.child] = true;
            for(Node node : graph.get(currentNode.child)) {
                if(distance[node.child] > distance[currentNode.child] + node.weight) {
                    distance[node.child] = distance[currentNode.child] + node.weight;
                    queue.add(new Node(node.child, distance[node.child]));
                }
            }
        }
    }

    private static class Node implements Comparable<Node> {
        int child;
        int weight;

        Node(int child, int weight) {
            this.child = child;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node node) {
            return weight - node.weight;
        }
    }
}
