import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ1167 {
    static ArrayList<ArrayList<Node>> list = new ArrayList<>();
    static boolean[] isVisited;
    static int max = 0;
    static int node = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int V = Integer.parseInt(br.readLine());
        isVisited = new boolean[V+1];
        for(int i = 0; i <= V; i++) {
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < V; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int rootNode = Integer.parseInt(st.nextToken());
            while(true) {
                int childNode = Integer.parseInt(st.nextToken());
                if(childNode == -1) {
                    break;
                }
                int cost = Integer.parseInt(st.nextToken());
                list.get(rootNode).add(new Node(childNode, cost));
            }
        }
        DFS(1, 0);
        isVisited = new boolean[V+1];
        DFS(node, 0);
        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void DFS(int startNode, int length) {
        if(length > max) {
            max = length;
            node = startNode;
        }
        isVisited[startNode] = true;
        for(int i = 0; i < list.get(startNode).size(); i++) {
            Node childNode = list.get(startNode).get(i);
            if(!isVisited[childNode.data]) {
                isVisited[childNode.data] = true;
                DFS(childNode.data, childNode.cost + length);
            }
        }
    }

    static class Node {
        int data;
        int cost;

        public Node(int data, int cost) {
            this.data = data;
            this.cost = cost;
        }
    }
}
