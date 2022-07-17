import java.io.*;
import java.util.Arrays;

public class BOJ2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] dwarfs = new int[9];
        boolean find = false;
        int sum = 0;
        for(int i = 0; i < 9; i++) {
            dwarfs[i] = Integer.parseInt(br.readLine());
            sum += dwarfs[i];
        }

        Arrays.sort(dwarfs);

        int firstNum = 0;
        int secondNum = 0;
        for(int i = 0; i < 8 && !find; i++) {
            for(int j = i+1; j < 9; j++) {
                if(sum - dwarfs[i] - dwarfs[j] == 100) {
                    firstNum = i;
                    secondNum = j;
                    find = true;
                    break;
                }
            }
        }

        for(int i = 0; i < 9; i++) {
            if(i == firstNum || i == secondNum) {
                continue;
            }
            bw.write(dwarfs[i]+"\n");
            bw.flush();
        }

        bw.close();
        br.close();
    }
}
