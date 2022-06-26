import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ11724 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[] isVisited = new boolean[N+1];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int count = 0;

        //그래프 초기화 (노드 수 만큼)
        for(int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        //그래프 간선 정보 입력
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for(int i = 1; i <= N; i++) {
            //이미 방문한 노드는 연결 요소에 포함되므로 검사할 필요 없음
            if(isVisited[i]) {
                continue;
            }
            //너비 우선 탐색을 통해 해당 노드로 시작하는 연결 요소가 있는지 검사
            count += BFS(i, graph, isVisited);
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }

    static int BFS(int V, ArrayList<ArrayList<Integer>> graph, boolean[] isVisited) {
        int count = 0;

        Queue<Integer> waitNode = new LinkedList<>(); //탐색 대기 큐
        waitNode.offer(V); //탐색 대기 큐에 현재 노드 입력
        isVisited[V] = true; //현재 노드는 방문했음

        //탐색 대기 큐가 전부 비워질 때까지
        while(!waitNode.isEmpty()){
            int currentNode = waitNode.poll(); //탐색 대기 큐의 노드 꺼내와서
            //자식 노드 갯수 만큼 반복
            for(int i = 0; i < graph.get(currentNode).size(); i++) {
                //자식 노드 받아와서
                int childNode = graph.get(currentNode).get(i);
                //방문한 적 없으면
                if(!isVisited[childNode]) {
                    //탐색 대상으로 넣고
                    waitNode.offer(childNode);
                    //방문했음을 체크
                    isVisited[childNode] = true;
                }
            }
        }

        //전부 탐색 완료했다면 연결 요소
        count++;
        return count;
    }
}
