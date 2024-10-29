package BOJ27913;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String baseWord = "SciComLove";
        StringTokenizer command = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(command.nextToken());
        int Q = Integer.parseInt(command.nextToken());
        int capitalCharCount = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            char ch = baseWord.charAt(i % baseWord.length());
            if (Character.isUpperCase(ch)) {
                capitalCharCount++;
            }
            sb.append(ch);
        }

        for (int i = 0; i < Q; i++) {
            int index = Integer.parseInt(br.readLine()) - 1;
            if (Character.isUpperCase(sb.charAt(index))) {
                sb.setCharAt(index, Character.toLowerCase(sb.charAt(index)));
                capitalCharCount--;
                bw.write(capitalCharCount + "\n");
                continue;
            }
            sb.setCharAt(index, Character.toUpperCase(sb.charAt(index)));
            capitalCharCount++;
            bw.write(capitalCharCount + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
