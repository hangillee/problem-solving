import java.io.*;
import java.util.Arrays;

public class BOJ1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        for(int i = 0; i < N; i++) {
            boolean[] alphabet = new boolean[26];
            Arrays.fill(alphabet, false);
            boolean isGroup = true;
            char[] groupWord = br.readLine().toCharArray();
            char lastChar = ' ';

            for(char c : groupWord) {
                if(lastChar == c) {
                    continue;
                }
                if(alphabet[c - 97]) {
                    isGroup = false;
                    break;
                }
                lastChar = c;
                alphabet[lastChar - 97] = true;
            }

            if(isGroup) {
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
