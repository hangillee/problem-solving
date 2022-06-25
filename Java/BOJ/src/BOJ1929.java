import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        //에라토스테네스의 체
        boolean[] eratos = new boolean[1000001];
        Arrays.fill(eratos, true);
        eratos[0] = false;
        eratos[1] = false;

        for(int i = 2; i < 1000001; i++) {
            for(int j = 2; i*j < 1000001; j++) {
                eratos[i * j] = false;
            }
        }

        //수의 범위를 받아옴
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int last = Integer.parseInt(st.nextToken());

        //주어진 범위 안의 수들이 에라토스테네스의 체에 걸러지는지 확인
        for(int i = first; i <= last; i++) {
            if(eratos[i]) {
                sb.append(i +"\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}