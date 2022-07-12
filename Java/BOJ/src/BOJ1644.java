import java.io.*;

public class BOJ1644 {
    static boolean[] primeNum = new boolean[4000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int count = 0;

        eratos();

        for(int i = 2; i <= N; i++) {
            if(primeNum[i]) {
                continue;
            }
            sum = 0;
            for(int j = i; j <= N; j++) {
                if(!primeNum[j]) {
                    sum += j;
                }
                if(sum == N) {
                    count++;
                    break;
                } else if (sum > N) {
                    break;
                }
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void eratos() {
        primeNum[0] = primeNum[1] = true;

        for(int i = 2; i*i <= 4000000; i++) {
            if(!primeNum[i]) {
                for(int j = i*i; j <= 4000000; j += i) {
                    primeNum[j] = true;
                }
            }
        }
    }
}
