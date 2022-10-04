import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ2252 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] indegrees = new int[N + 1];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            graph.get(parent).add(child);
            indegrees[child] += 1;
        }

        bw.write(topologySort(indegrees, graph));
        bw.flush();
        bw.close();
        br.close();
    }

    static String topologySort(int[] indegrees, ArrayList<ArrayList<Integer>> graph) {
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new ArrayDeque<>();
        for(int i = 1; i < indegrees.length; i++) {
            if(indegrees[i] == 0) {
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()) {
            int currentNode = queue.poll();
            sb.append(currentNode).append(" ");

            ArrayList<Integer> list = graph.get(currentNode);
            for(int i = 0; i < list.size(); i++) {
                int childNode = list.get(i);
                indegrees[childNode]--;
                if(indegrees[childNode] == 0) {
                    queue.offer(childNode);
                }
            }
        }

        return sb.toString();
    }
}
