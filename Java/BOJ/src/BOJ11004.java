import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Integer[] num = new Integer[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        sb.append(num[K-1]);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
