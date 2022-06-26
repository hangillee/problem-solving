import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] num = new Integer[N];

        for(int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        int first = 0;
        int last = num.length - 1;

        bw.write(String.valueOf(num[first] * num[last]));
        bw.flush();
        bw.close();
        br.close();
    }
}
