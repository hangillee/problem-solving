import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ2331 {
    static ArrayList<Integer> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int N;
        graph.add(A);

        while(true) {
            N = 0;
            while(A > 0) {
                N += (int)Math.pow((A % 10), P);
                A /= 10;
            }
            A = N;
            if(graph.contains(N)) {
                bw.write(String.valueOf(graph.indexOf(N)));
                bw.flush();
                break;
            }
            graph.add(N);
        }
        bw.close();
    }
}
