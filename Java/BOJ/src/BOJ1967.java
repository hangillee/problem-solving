import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ1967 {
    static ArrayList<ArrayList<Node>> tree = new ArrayList<>();
    static boolean[] isVisited;
    static int max = 0;
    static int node;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        isVisited = new boolean[n+1];

        for(int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }

        for(int i = 0; i < n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int rootNode = Integer.parseInt(st.nextToken());
            int childNode = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            tree.get(rootNode).add(new Node(childNode, cost));
            tree.get(childNode).add(new Node(rootNode, cost));
        }

        DFS(1, 0);
        isVisited = new boolean[n+1];
        DFS(node, 0);
        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void DFS(int startNode, int costSum) {
        if(costSum > max) {
            max = costSum;
            node = startNode;
        }
        isVisited[startNode] = true;
        for(int i = 0; i < tree.get(startNode).size(); i++) {
            Node childNode = tree.get(startNode).get(i);
            if(!isVisited[childNode.data]) {
                isVisited[childNode.data] = true;
                DFS(childNode.data, childNode.cost + costSum);
            }
        }
    }

    static class Node {
        int data;
        int cost;
        Node(int data, int cost) {
            this.data = data;
            this.cost = cost;
        }
    }
}
