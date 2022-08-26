import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];

        for(int i = 0; i < words.length; i++) {
            words[i] = br.readLine();
        }

        Arrays.sort(words);
        Arrays.sort(words, Comparator.comparingInt(String::length));

        String lastWord = "";
        for(String s : words) {
            if(lastWord.equals(s)) {
                continue;
            }
            bw.write(s + "\n");
            lastWord = s;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
