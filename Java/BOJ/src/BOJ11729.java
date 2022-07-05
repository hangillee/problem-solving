import java.io.*;

public class BOJ11729 {
    static int count = 0;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        hanoiTower(N, 1, 3, 2);
        bw.write(count + "\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static void hanoiTower(int n, int start, int end, int thr) throws IOException {
        count++;
        if(n == 1) {
            sb.append(start + " " + end + "\n");
            return;
        } else {
            hanoiTower(n - 1, start, thr, end);
            sb.append(start + " " + end + "\n");
            hanoiTower(n - 1, thr, end, start);
        }
    }
}
