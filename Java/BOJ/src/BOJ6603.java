import java.io.*;
import java.util.StringTokenizer;

public class BOJ6603 {
    static int[] numSet;
    static boolean[] isVisited;
    static int k;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        while(true) {
            st = new StringTokenizer(br.readLine());
            String testCase = st.nextToken();
            if(testCase.equals("0")) {
                break;
            } else {
                k = Integer.parseInt(testCase);
                numSet = new int[k];
                isVisited = new boolean[k];
                for(int i = 0; i < k; i++) {
                    numSet[i] = Integer.parseInt(st.nextToken());
                }
                DFS(0, 0);
                bw.write("\n");
                bw.flush();
            }
        }
    }

    public static void DFS(int length, int num) throws IOException {
        if(length == 6) {
            for(int i = 0; i < k; i++) {
                if(isVisited[i]) {
                    bw.write(numSet[i] + " ");
                    bw.flush();
                }
            }
            bw.write("\n");
            bw.flush();
            return;
        }

        for(int i = num; i < k; i++) {
            if(!isVisited[i]) {
                isVisited[i] = true;
                DFS(length+1, i);
                isVisited[i] = false;
            }
        }
    }
}
