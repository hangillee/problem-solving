import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BOJ25083 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        sb.append("         ,r'\"7\n" +
                "r`-_   ,'  ,/\n" +
                " \\. \". L_r'\n" +
                "   `~\\/\n" +
                "      |\n" +
                "      |");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
