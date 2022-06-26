import java.io.*;
import java.util.*;
import java.util.Queue;

public class BOJ1260 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //노드 수
        int M = Integer.parseInt(st.nextToken()); //간선 수
        int V = Integer.parseInt(st.nextToken()); //시작 노드
        boolean[] isVisited = new boolean[N + 1]; //방문 체크 배열
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); //그래프

        //그래프 내용 초기화
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        //그래프 간선 정보 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            graph.get(parent).add(child);
            graph.get(child).add(parent);
        }

        //그래프 자식 노드들 오름차순 정렬
        for (int i = 0; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        DFS.startDFS(V, isVisited, graph);
        bw.write("\n");
        bw.flush();
        isVisited = new boolean[N + 1];
        BFS.startBFS(V, isVisited, graph);

        bw.close();
        br.close();
    }
}

class BFS {
    public static void startBFS(int V, boolean[] isVisited, ArrayList<ArrayList<Integer>> graph) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> waitNode = new LinkedList<>(); //탐색 대기 중인 노드들 저장 큐
        waitNode.offer(V); //시작 노드 위치를 탐색 대기 큐에 저장
        isVisited[V] = true; //시작 노드는 방문했으니 체크

        //대기 중인 노드가 없을 때까지 반복 (모두 탐색할 때까지)
        while(!waitNode.isEmpty()) {
            //대기 중인 노드를 꺼내옴
            int currentNode = waitNode.poll();
            //방문한 노드 출력
            bw.write(currentNode + " ");
            bw.flush();

            //현재 노드의 자식 노드들 수 만큼 반복
            for(int i = 0; i < graph.get(currentNode).size(); i++) {
                //첫 번째 자식 노드를 받아와
                int childNode = graph.get(currentNode).get(i);
                //탐색하지 않았다면
                if(!isVisited[childNode]) {
                    //탐색 대기 큐에 추가하고
                    waitNode.offer(childNode);
                    //방문했다고 체크 (해당 노드의 자식 노드 탐색을 하지 않았지 방문은 했다.)
                    isVisited[childNode] = true;
                }
            }
        }
    }
}

class DFS {
    public static void startDFS(int V, boolean[] isVisited, ArrayList<ArrayList<Integer>> graph) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        isVisited[V] = true; //방문한 노드 체크
        bw.write(V + " "); //방문한 노드 출력
        bw.flush();
        //현재 노드의 자식 노드들 수 만큼 반복 (자식 노드가 없다면 수행되지 않음)
        for(int i = 0; i < graph.get(V).size(); i++) {
            //첫 번째 자식 노드를 받아와
            int childNode = graph.get(V).get(i);
            //탐색하지 않았다면
            if (!isVisited[childNode]) {
                //자식 노드로 들어감
                startDFS(childNode, isVisited, graph);
            }
        }
    }
}
