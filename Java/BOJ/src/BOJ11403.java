import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ11403 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static List<GraphNode> nodes = new ArrayList<>();
    static boolean[] isVisited;
    static int[][] matrix;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        isVisited = new boolean[N];
        matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            nodes.add(new GraphNode(i));
        }

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                if (st.nextToken().equals("1")) {
                    nodes.get(i).nextNodes.add(nodes.get(j));
                }
            }
        }

        for (GraphNode node : nodes) {
            DFS(node);
            isVisited = new boolean[N];
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                bw.write(matrix[i][j] + " ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void DFS(GraphNode node) {
        Deque<GraphNode> stack = new ArrayDeque<>();
        stack.push(node);
        isVisited[node.index] = true;
        int initNodeIndex = node.index;

        while(!stack.isEmpty()) {
            GraphNode currentNode = stack.pop();
            for (GraphNode nextNode : currentNode.nextNodes) {
                matrix[initNodeIndex][nextNode.index] = 1;
                if (!isVisited[nextNode.index]) {
                    stack.push(nextNode);
                    isVisited[nextNode.index] = true;
                }
            }
        }
    }
}

class GraphNode {
    int index;
    List<GraphNode> nextNodes = new ArrayList<>();

    public GraphNode(int index) {
        this.index = index;
    }
}