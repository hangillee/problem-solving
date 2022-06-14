import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//EOF 처리 확실히 알아두자.
public class BOJ11719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String myStr;

        while((myStr = br.readLine()) != null) {
            System.out.println(myStr);
        }

    }
}
