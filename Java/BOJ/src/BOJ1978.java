import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        //에라토스테네스의 체
        boolean[] eratos = new boolean[1001];
        Arrays.fill(eratos, true);
        eratos[0] = false;
        eratos[1] = false;

        for(int i = 2; i < 1001; i++) {
            for(int j = 2; i*j < 1001; j++) {
                eratos[i * j] = false;
            }
        }

        //수의 개수만큼 수를 받아옴
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        //해당 수가 에라토스테네스의 체에 걸러지는지 확인
        int count = 0;
        for(int i = 0; i < num.length; i++) {
            if(eratos[num[i]]) {
                count++;
            }
        }
        sb.append(count);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
