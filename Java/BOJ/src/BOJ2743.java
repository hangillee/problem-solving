import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader strBr = new BufferedReader(new InputStreamReader(System.in));
        String targetStr = strBr.readLine();

        System.out.println(targetStr.length());
    }
}
