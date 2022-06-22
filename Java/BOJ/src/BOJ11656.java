import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String str = br.readLine();
        String[] strArr = new String[str.length()];

        for(int i = 0; i < strArr.length; i++) {
            strArr[i] = str.substring(i);
        }

        Arrays.sort(strArr);

        for(int i = 0; i < strArr.length; i++) {
            sb.append(strArr[i]);
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
