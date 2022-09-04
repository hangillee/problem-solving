import java.io.*;
import java.util.StringTokenizer;

public class BOJ1168 {
    static int[] segTree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        segTree = new int[N * 4];

        //1부터 N까지의 수를 1(루트 노드)부터 세그먼트 트리에 대입
        init(1, N, 1);

        bw.write("<");

        int index = 1;
        int size = 0;
        for(int i = 0; i < N; i++) {
            size = N - i;
            index += K - 1;
            //만약 현재 인덱스가 사람 수의 배수이면
            if (index % size == 0) {
                index = size;
            } else if(index > size) {
                index %= size;
            }

            int numAtK = query(1, N, 1, index);
            update(1, N, 1, numAtK);

            if(size == 1) {
                bw.write(numAtK + ">");
            } else {
                bw.write(numAtK + ", ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    //세그먼트 트리는 이진 트리이다.
    static int init(int start, int end, int node) {
        //리프 노드 도달 시
        if(start == end) {
            return segTree[node] = 1;
        }
        int mid = (start + end) / 2;
        //리프 노드가 아닌 노드엔 서브 트리의 구간합 저장
        return segTree[node] = (init(start, mid, node * 2) + init(mid + 1, end, node * 2 + 1));
    }

    //세그먼트 트리에서 K번 째 수를 찾는 메소드
    static int query(int start, int end, int node, int K) {
        if(start == end) {
            return end;
        }
        int mid = (start + end) / 2;
        //왼쪽 서브 트리의 구간합보다 작거나 같을 경우 왼쪽 노드들 중에 있음
        if(K <= segTree[node * 2]) {
            return query(start, mid, node * 2, K);
        } else {
            return query(mid + 1, end, node * 2 + 1, K - segTree[node * 2]);
        }
    }

    //K번 째 수를 찾은 후, 그 위치의 수 추출
    static int update(int start, int end, int node, int num) {
        if(start == end) {
            return segTree[node] = 0;
        }
        //구간 합들에서 1씩 줄여야함
        segTree[node]--;
        int mid = (start + end) / 2;
        if(num <= mid) {
            return update(start, mid, node * 2, num);
        } else {
            return update(mid + 1, end, node * 2 + 1, num);
        }
    }
}
