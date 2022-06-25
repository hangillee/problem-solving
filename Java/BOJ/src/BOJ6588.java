import java.io.*;
import java.util.Arrays;

public class BOJ6588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

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

        int count = 0;
        while(count < 100000) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                break;
            }

            for(int i = 3; i < num; i++) {
                if(eratos[i]) {
                    if(eratos[num - i]) {
                        bw.write(num + " = " + i + " + " + (num - i) + "\n");
                        bw.flush();
                        break;
                    }
                } else if((i + 1) > num) {
                    bw.write("Goldbach's conjecture is wrong.");
                    bw.flush();
                }
            }
            count++;
        }
        bw.close();
        br.close();
    }
}
