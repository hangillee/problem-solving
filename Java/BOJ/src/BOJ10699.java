import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.LocalDate;

public class BOJ10699 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LocalDate seoulDate = LocalDate.now();
        bw.write(String.valueOf(seoulDate));
        bw.flush();
        bw.close();
    }
}
