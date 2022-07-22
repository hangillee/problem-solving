import java.io.*;

public class BOJ1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] numSet = new int[10];
        int N = Integer.parseInt(br.readLine());

        while(N > 0) {
            if(N % 10 == 6 || N % 10 == 9) {
                if(numSet[6] <= numSet[9]) {
                    numSet[6]++;
                } else {
                    numSet[9]++;
                }
                N /= 10;
                continue;
            }
            numSet[N % 10]++;
            N /= 10;
        }

        int max = 0;
        for(int i : numSet) {
            if(i > max) {
                max = i;
            }
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();
    }
}
