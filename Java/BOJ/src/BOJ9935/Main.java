package BOJ9935;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String target = br.readLine();
        String explosive = br.readLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < target.length(); i++) {
            result.append(target.charAt(i));
            if (result.length() >= explosive.length()) {
                if (target.charAt(i) == explosive.charAt(explosive.length() - 1)) {
                    int explosiveStartIndex = result.length() - explosive.length();
                    if (result.substring(explosiveStartIndex).equals(explosive)) {
                        result.delete(explosiveStartIndex, result.length());
                    }
                }
            }
        }

        if (result.isEmpty()) {
            bw.write("FRULA");
        } else {
            bw.write(result.toString());
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
