import java.io.*;

public class BOJ2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int constructor = 0;
        for(int i = 1; i < N; i++) {
            int targetNum = i;
            int divideSum = 0;

            while(targetNum > 0) {
                divideSum += targetNum % 10;
                targetNum /= 10;
            }
            divideSum += i;

            if(divideSum == N) {
                constructor = i;
                break;
            }
        }

        bw.write(String.valueOf(constructor));
        bw.flush();
        bw.close();
        br.close();
    }
}
