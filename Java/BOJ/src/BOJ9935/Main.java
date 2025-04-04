package BOJ9935;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String target = br.readLine();
        String explosive = "(" + br.readLine() + ")";
        Pattern pattern = Pattern.compile(explosive);

        while (!target.isBlank()) {
            target = target.replaceAll(explosive, "");
            Matcher matcher = pattern.matcher(target);
            if (!matcher.find()) {
                break;
            }
        }
        if (target.isBlank()) {
            bw.write("FRULA");
        } else {
            bw.write(target);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
