import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BOJ16170 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Date currentDate = new Date();
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy\nMM\ndd");
        String answer = simpleDate.format(currentDate);

        bw.write(answer);
        bw.flush();
        bw.close();
    }
}
