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

        explosive = String.join("*", explosive.split(""));
        String result = target.replaceAll(explosive, "");
        if (result.isBlank()) {
            bw.write("FRULA");
        } else {
            bw.write(result);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
