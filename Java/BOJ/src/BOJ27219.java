import java.io.*;

public class BOJ27219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int V = N / 5;
        int I = N % 5;
        for(int i = 0; i < V; i++) {
            bw.write("V");
        }
        for(int i = 0; i < I; i++) {
            bw.write("I");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
