import java.io.*;
import java.util.StringTokenizer;

public class BOJ11328 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int[] alphabet = new int[26];
            char[] originStr = st.nextToken().toCharArray();
            char[] targetStr = st.nextToken().toCharArray();

            for(char c : originStr) {
                alphabet[c - 97]++;
            }

            for(char c : targetStr) {
                alphabet[c - 97]--;
            }

            boolean flag = true;
            for(int j : alphabet) {
                if(j != 0) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                bw.write("Possible\n");
            } else {
                bw.write("Impossible\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
