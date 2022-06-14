import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String targetStr = br.readLine();
        char[] strToChar = targetStr.toCharArray();
        int counter = 1;

        for(int i = 0; i < strToChar.length; i++) {
            System.out.print(strToChar[i]);
            if(counter % 10 == 0) {
                System.out.println();
            }
            counter++;
        }
    }
}
