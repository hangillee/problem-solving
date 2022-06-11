import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader strBr = new BufferedReader(new InputStreamReader(System.in));
        String targetStr = strBr.readLine();
        char[] targetArr = targetStr.toCharArray();

        for (int i = 0; i < targetArr.length; i++) {
            if(97 <= targetArr[i] && targetArr[i] <= 122) {
                targetArr[i] -= 32;
            }
            else if(65 <= targetArr[i] && targetArr[i] <= 90) {
                targetArr[i] += 32;
            }
            System.out.print(targetArr[i]);
        }
    }
}
