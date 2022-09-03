import java.io.*;
import java.util.Arrays;

public class BOJ2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        boolean[] eratosthenes = new boolean[10001];
        Arrays.fill(eratosthenes, true);
        eratosthenes[0] = false;
        eratosthenes[1] = false;

        for(int i = 2; i * i <= N; i++) {
            if(eratosthenes[i]) {
                for(int j = i*i; j <= N; j += i) {
                    eratosthenes[j] = false;
                }
            }
        }

        boolean minimumFound = false;
        int minimumPrime = 0;
        int sumPrime = 0;
        for(int i = M; i <= N; i++) {
            if(eratosthenes[i] && !minimumFound) {
                minimumFound = true;
                minimumPrime = i;
            }

            if(eratosthenes[i]) {
                sumPrime += i;
            }
        }

        if(sumPrime != 0) {
            bw.write(sumPrime + "\n" + minimumPrime);
        } else {
            bw.write("-1");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
