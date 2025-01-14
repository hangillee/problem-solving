package BOJ30802;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] sizes = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < sizes.length; i++) {
            sizes[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int shirts = 0;
        for (int size : sizes) {
            if (size == 0) {
                continue;
            }
            int add = size % T == 0 ? 0 : 1;
            shirts += (size / T) + add;
        }

        int pens = N / P;
        int pen = N % P;

        bw.write(shirts + "\n");
        bw.write(pens + " " + pen);
        bw.flush();
        bw.close();
        br.close();
    }
}
