import java.io.*;
import java.util.StringTokenizer;

public class BOJ2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] N = st.nextToken().toCharArray();
        int B = Integer.parseInt(st.nextToken());
        int[] numbers = new int[N.length];
        int sum = 0;

        for(int i = 0; i < N.length; i++) {
            if(65 <= N[i] && N[i] <= 90) {
                numbers[i] = N[i] - 55;
            } else {
                numbers[i] = N[i] - '0';
            }
        }

        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i] * Math.pow(B, (numbers.length-1)-i);
        }

        sb.append(sum);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
