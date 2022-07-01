import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ11725 {
    static ArrayList<ArrayList<Integer>> list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        for(int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < N-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            list.get(A).add(B);
            list.get(B).add(A);
        }

        int[] roots = new int[N+1];
        DFS(roots, N, 1, 0);

        for(int i = 2; i <= N; i++) {
            bw.write(roots[i] + "\n");
            bw.flush();
        }
    }

    public static void DFS(int[] roots, int N, int start, int root) {
        roots[start] = root;
        for(int num : list.get(start)) {
            if(num != root) {
                DFS(roots, N, num, start);
            }
        }
    }
}