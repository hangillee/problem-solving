import java.io.*;

public class BOJ9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] erathosthenes = new boolean[10001];
        erathosthenes[0] = true;
        erathosthenes[1] = true;

        for(int i = 2; i*i < erathosthenes.length; i++) {
            for(int j = i*i; j < erathosthenes.length; j += i) {
                erathosthenes[j] = true;
            }
        }

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            for(int j = 0; j <= (N/2)-1; j++) {
                if(!erathosthenes[N/2-j] && !erathosthenes[N/2+j]) {
                    bw.write((N/2-j) + " " + (N/2+j) + "\n");
                    break;
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
