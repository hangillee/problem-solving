import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ2251 {
    static ArrayList<Integer> valueOfC = new ArrayList<>();
    static boolean[][] isVisited;
    static int valueA;
    static int valueB;
    static int valueC;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        valueA = Integer.parseInt(st.nextToken());
        valueB = Integer.parseInt(st.nextToken());
        valueC = Integer.parseInt(st.nextToken());

        isVisited = new boolean[201][201];

        DFS(0, 0, valueC);

        Collections.sort(valueOfC);
        for(int i = 0; i < valueOfC.size(); i++) {
            bw.write(valueOfC.get(i) + " ");
            bw.flush();
        }
    }

    public static void DFS(int A, int B, int C) {
        if(isVisited[A][B]) {
            return;
        }
        if(A == 0) {
            valueOfC.add(C);
        }
        isVisited[A][B] = true;
        //C to A
        if(A+C > valueA) {
            DFS(valueA, B, A+C-valueA);
        } else {
            DFS(A+C, B, 0);
        }
        //C to B
        if(B+C > valueB) {
            DFS(A, valueB, B+C-valueB);
        } else {
            DFS(A, B+C, 0);
        }
        //A to B
        if(A+B > valueB) {
            DFS(A+B-valueB, valueB, C);
        } else {
            DFS(0, A+B, C);
        }
        //B to A
        if(B+A > valueA) {
            DFS(valueA, B+A-valueA, C);
        } else {
            DFS(B+A, 0, C);
        }
        //A to C
        DFS(0, B, A+C);
        //B to C
        DFS(A, 0, B+C);
    }
}
