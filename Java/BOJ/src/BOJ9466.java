import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ9466 {
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] isVisited;
    static boolean[] isFinished;
    static int nodeCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine()); //테스트 케이스의 개수

        for(int i = 0; i < T; i++) {
            //매 테스트케이스마다 새 그래프
            graph = new ArrayList<>();
            //매 테스트케이스마다 변수 초기화
            nodeCount = 0;

            //노드 수 (학생 수)
            int N = Integer.parseInt(br.readLine());
            isVisited = new boolean[N+1];
            isFinished = new boolean[N+1];

            //그래프 초기화
            for(int j = 0; j <= N; j++) {
                graph.add(new ArrayList<>());
            }

            //각 학생이 선택한 학생들로 그래프 생성 (간선)
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= N; j++) {
                graph.get(j).add(Integer.parseInt(st.nextToken()));
            }

            //이미 방문한 노드를 제외하고 깊이 우선 탐색 실행
            for(int j = 1; j <= N; j++) {
                if(!isVisited[j]) {
                    DFS(j);
                }
            }
            //전체 학생 중 사이클에 포함되지 않는 학생 수 출력
            bw.write(N - nodeCount + "\n");
            bw.flush();
        }
        bw.close();
        br.close();
    }

    public static void DFS(int node) {
        //만약 이미 방문한 노드일 경우
        if(isVisited[node]) {
            //탐색 완료되었음을 표시 (사이클임)
            isFinished[node] = true;
            //재귀 반환되면서 사이클에 있는 노드 수 합산
            nodeCount++;
        } else {
            isVisited[node] = true;
        }
        ArrayList<Integer> childNodes = graph.get(node);

        //방문한 자식 노드가 아니면 깊이 우선 탐색
        if(!isFinished[childNodes.get(0)]) {
            DFS(childNodes.get(0));
        }
        //탐색 종료
        isVisited[node] = false;
        isFinished[node] = true;
    }
}
