import java.io.*;
import java.util.StringTokenizer;

public class BOJ1717 {
    static int[] parents;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        parents = new int[n+1];
        for(int i = 0; i <= n; i++) {
            parents[i] = i;
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            int firstSet = Integer.parseInt(st.nextToken());
            int secondSet = Integer.parseInt(st.nextToken());

            switch (command) {
                case 0:
                    union(firstSet, secondSet);
                    break;
                case 1:
                    if(find(firstSet) == find(secondSet)) {
                        bw.write("YES\n");
                    } else {
                        bw.write("NO\n");
                    }
                    break;
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static int find(int node){
        if(parents[node] != node) {
            parents[node] = find(parents[node]);
        }
        return parents[node];
    }

    public static void union(int firstSet, int secondSet) {
        int firstRoot = find(firstSet);
        int secondRoot = find(secondSet);
        if(firstRoot != secondRoot) {
            if(firstRoot < secondRoot) {
                parents[secondRoot] = firstRoot;
            } else {
                parents[firstRoot] = secondRoot;
            }
        }
    }
}