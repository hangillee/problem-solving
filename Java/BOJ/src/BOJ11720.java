import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        String numStr = br.readLine();
        int result = 0;

        for(int i = 0; i < testCase; i++) {
            result += Integer.parseInt(String.valueOf(numStr.charAt(i)));
        }
        System.out.println(result);
    }
}
