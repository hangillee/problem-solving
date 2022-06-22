import java.io.*;

public class BOJ10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int[] alphabet = new int[26];
        String word = br.readLine();

        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            alphabet[c - 97]++;
        }

        for(int i = 0; i < 26; i++) {
            sb.append(alphabet[i]).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
