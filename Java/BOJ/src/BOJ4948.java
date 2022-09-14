import java.io.*;

public class BOJ4948 {
    static boolean[] erathosthenes;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) {
                break;
            }

            int primeCount = 0;
            getErathosthenes(2*n);
            for(int i = n+1; i <= 2*n; i++) {
                if(!erathosthenes[i]) {
                    primeCount++;
                }
            }

            bw.write(primeCount+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void getErathosthenes(int n) {
        erathosthenes = new boolean[n+1];
        erathosthenes[0] = true;
        erathosthenes[1] = true;

        //제곱근까지만
        for(int i = 2; i*i <= n; i++) {
            if(erathosthenes[i]) {
                continue;
            }
            for(int j = i*i; j <= n; j += i) {
                erathosthenes[j] = true;
            }
        }
    }
}
